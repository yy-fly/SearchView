package com.yyfly.android.search;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListView;

/**
 * Expand ListView
 */
public class ExpandListView extends ListView {
    public ExpandListView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    /**
     * 重写该方法，达到使ListView适应ScrollView的效果
     */
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int expandSpec = MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE >> 2, MeasureSpec.AT_MOST);
        super.onMeasure(widthMeasureSpec, expandSpec);
    }
}