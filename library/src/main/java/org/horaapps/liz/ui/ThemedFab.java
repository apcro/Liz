package org.horaapps.liz.ui;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;

import androidx.annotation.Nullable;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.mikepenz.iconics.IconicsDrawable;

import org.horaapps.liz.R;
import org.horaapps.liz.ThemeHelper;
import org.horaapps.liz.Themed;


/**
 * Created by dnld on 04.03.2017.
 */
public class ThemedFab extends FloatingActionButton implements Themed {

    private IconicsDrawable mIcon = null;

    public ThemedFab(Context context) {
        this(context, null);
    }

    public ThemedFab(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ThemedFab(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        TypedArray a = getContext().obtainStyledAttributes(attrs, R.styleable.ThemedFab);
        setIcon(a.getString(R.styleable.ThemedFab_liz_icon));
        a.recycle();
    }

    @Override
    public void refreshTheme(ThemeHelper theme) {
        setBackgroundTintList(ColorStateList.valueOf(theme.getAccentColor()));
        setImageDrawable(mIcon);
    }

    public void setIcon(String icon) {
//        mIcon = new IconicsDrawable(getContext()).icon(icon).color(IconicsColor.colorInt(Color.WHITE));
    }
}
