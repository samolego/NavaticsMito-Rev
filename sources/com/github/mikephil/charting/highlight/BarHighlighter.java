package com.github.mikephil.charting.highlight;

import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.BarLineScatterCandleBubbleData;
import com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.github.mikephil.charting.utils.MPPointD;

/* loaded from: classes.dex */
public class BarHighlighter extends ChartHighlighter<BarDataProvider> {
    public BarHighlighter(BarDataProvider barDataProvider) {
        super(barDataProvider);
    }

    @Override // com.github.mikephil.charting.highlight.ChartHighlighter, com.github.mikephil.charting.highlight.IHighlighter
    public Highlight getHighlight(float f, float f2) {
        Highlight highlight = super.getHighlight(f, f2);
        if (highlight == null) {
            return null;
        }
        MPPointD valsForTouch = getValsForTouch(f, f2);
        IBarDataSet iBarDataSet = (IBarDataSet) ((BarDataProvider) this.mChart).getBarData().getDataSetByIndex(highlight.getDataSetIndex());
        if (iBarDataSet.isStacked()) {
            return getStackedHighlight(highlight, iBarDataSet, (float) valsForTouch.f2598x, (float) valsForTouch.f2599y);
        }
        MPPointD.recycleInstance(valsForTouch);
        return highlight;
    }

    public Highlight getStackedHighlight(Highlight highlight, IBarDataSet iBarDataSet, float f, float f2) {
        BarEntry barEntry = (BarEntry) iBarDataSet.getEntryForXValue(f, f2);
        if (barEntry == null) {
            return null;
        }
        if (barEntry.getYVals() == null) {
            return highlight;
        }
        Range[] ranges = barEntry.getRanges();
        if (ranges.length > 0) {
            int closestStackIndex = getClosestStackIndex(ranges, f2);
            MPPointD pixelForValues = ((BarDataProvider) this.mChart).getTransformer(iBarDataSet.getAxisDependency()).getPixelForValues(highlight.getX(), ranges[closestStackIndex].f2589to);
            Highlight highlight2 = new Highlight(barEntry.getX(), barEntry.getY(), (float) pixelForValues.f2598x, (float) pixelForValues.f2599y, highlight.getDataSetIndex(), closestStackIndex, highlight.getAxis());
            MPPointD.recycleInstance(pixelForValues);
            return highlight2;
        }
        return null;
    }

    protected int getClosestStackIndex(Range[] rangeArr, float f) {
        if (rangeArr == null || rangeArr.length == 0) {
            return 0;
        }
        int i = 0;
        for (Range range : rangeArr) {
            if (range.contains(f)) {
                return i;
            }
            i++;
        }
        int max = Math.max(rangeArr.length - 1, 0);
        if (f > rangeArr[max].f2589to) {
            return max;
        }
        return 0;
    }

    @Override // com.github.mikephil.charting.highlight.ChartHighlighter
    protected float getDistance(float f, float f2, float f3, float f4) {
        return Math.abs(f - f3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.mikephil.charting.highlight.ChartHighlighter
    public BarLineScatterCandleBubbleData getData() {
        return ((BarDataProvider) this.mChart).getBarData();
    }
}
