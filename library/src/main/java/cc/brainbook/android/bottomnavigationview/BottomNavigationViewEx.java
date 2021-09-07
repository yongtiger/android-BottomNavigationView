package cc.brainbook.android.bottomnavigationview;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.ColorInt;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.bottomnavigation.BottomNavigationItemView;
import com.google.android.material.bottomnavigation.BottomNavigationMenuView;
import com.google.android.material.shape.MaterialShapeDrawable;

public class BottomNavigationViewEx extends BottomNavigationViewInner {

    public BottomNavigationViewEx(Context context) {
        this(context, null);
    }

    public BottomNavigationViewEx(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public BottomNavigationViewEx(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        ///[BezierCurve]
        if (attrs != null) {
            TypedArray ta = context.obtainStyledAttributes(attrs, R.styleable.BottomNavigationViewEx, 0, 0);
            try {
                ///dp2px
                ///https://blog.csdn.net/zhangphil/article/details/80613879
                mBezierCurveCircleRadius = Math.round(getResources().getDisplayMetrics().density
                        * ta.getInt(R.styleable.BottomNavigationViewEx_bezierCurveCircleRadius, 0));
            } finally {
                ta.recycle();
            }

            if (mBezierCurveCircleRadius != 0) {
                init();
            }
        }
    }

    @Override
    public BottomNavigationViewInner setIconVisibility(boolean visibility) {
        try {
            return super.setIconVisibility(visibility);
        } catch (Exception e) {
            return this;
        }
    }

    @Override
    public BottomNavigationViewInner setTextVisibility(boolean visibility) {
        try {
            return super.setTextVisibility(visibility);
        } catch (Exception e) {
            return this;
        }
    }

    @Override
    public BottomNavigationViewInner enableAnimation(boolean enable) {
        try {
            return super.enableAnimation(enable);
        } catch (Exception e) {
            return this;
        }
    }

    @Override
    public BottomNavigationViewInner enableShiftingMode(boolean enable) {
        try {
            return super.enableShiftingMode(enable);
        } catch (Exception e) {
            return this;
        }
    }

    @Override
    public BottomNavigationViewInner enableItemShiftingMode(boolean enable) {
        try {
            return super.enableItemShiftingMode(enable);
        } catch (Exception e) {
            return this;
        }
    }

    @Override
    public int getCurrentItem() {
        try {
            return super.getCurrentItem();
        } catch (Exception e) {
            return 0;
        }
    }

    @Override
    public int getMenuItemPosition(MenuItem item) {
        try {
            return super.getMenuItemPosition(item);
        } catch (Exception e) {
            return 0;
        }
    }

    @Override
    public BottomNavigationViewInner setCurrentItem(int index) {
        try {
            return super.setCurrentItem(index);
        } catch (Exception e) {
            return this;
        }
    }

    @Override
    public OnNavigationItemSelectedListener getOnNavigationItemSelectedListener() {
        try {
            return super.getOnNavigationItemSelectedListener();
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public void setOnNavigationItemSelectedListener(OnNavigationItemSelectedListener listener) {
        try {
            super.setOnNavigationItemSelectedListener(listener);
        } catch (Exception e) {
        }
    }

    @Override
    public BottomNavigationMenuView getBottomNavigationMenuView() {
        return super.getBottomNavigationMenuView();
    }

    @Override
    public BottomNavigationViewInner clearIconTintColor() {
        try {
            return super.clearIconTintColor();
        } catch (Exception e) {
            return this;
        }
    }

    @Override
    public BottomNavigationItemView[] getBottomNavigationItemViews() {
        try {
            return super.getBottomNavigationItemViews();
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public BottomNavigationItemView getBottomNavigationItemView(int position) {
        try {
            return super.getBottomNavigationItemView(position);
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public ImageView getIconAt(int position) {
        try {
            return super.getIconAt(position);
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public TextView getSmallLabelAt(int position) {
        try {
            return super.getSmallLabelAt(position);
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public TextView getLargeLabelAt(int position) {
        try {
            return super.getLargeLabelAt(position);
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public int getItemCount() {
        try {
            return super.getItemCount();
        } catch (Exception e) {
            return 0;
        }
    }

    @Override
    public BottomNavigationViewInner setSmallTextSize(float sp) {
        try {
            return super.setSmallTextSize(sp);
        } catch (Exception e) {
            return this;
        }
    }

    @Override
    public BottomNavigationViewInner setLargeTextSize(float sp) {
        try {
            return super.setLargeTextSize(sp);
        } catch (Exception e) {
            return this;
        }
    }

    @Override
    public BottomNavigationViewInner setTextSize(float sp) {
        try {
            return super.setTextSize(sp);
        } catch (Exception e) {
            return this;
        }
    }

    @Override
    public BottomNavigationViewInner setIconSizeAt(int position, float width, float height) {
        try {
            return super.setIconSizeAt(position, width, height);
        } catch (Exception e) {
            return this;
        }
    }

    @Override
    public BottomNavigationViewInner setIconSize(float width, float height) {
        try {
            return super.setIconSize(width, height);
        } catch (Exception e) {
            return this;
        }
    }

    @Override
    public BottomNavigationViewInner setIconSize(float dpSize) {
        try {
            return super.setIconSize(dpSize);
        } catch (Exception e) {
            return this;
        }
    }

    @Override
    public BottomNavigationViewInner setItemHeight(int height) {
        try {
            return super.setItemHeight(height);
        } catch (Exception e) {
            return this;
        }
    }

    @Override
    public int getItemHeight() {
        try {
            return super.getItemHeight();
        } catch (Exception e) {
            return 0;
        }
    }

    @Override
    public BottomNavigationViewInner setTypeface(Typeface typeface, int style) {
        try {
            return super.setTypeface(typeface, style);
        } catch (Exception e) {
            return this;
        }
    }

    @Override
    public BottomNavigationViewInner setTypeface(Typeface typeface) {
        try {
            return super.setTypeface(typeface);
        } catch (Exception e) {
            return this;
        }
    }

    @Override
    public BottomNavigationViewInner setupWithViewPager(ViewPager viewPager) {
        try {
            return super.setupWithViewPager(viewPager);
        } catch (Exception e) {
            return this;
        }
    }

    @Override
    public BottomNavigationViewInner setupWithViewPager(ViewPager viewPager, boolean smoothScroll) {
        try {
            return super.setupWithViewPager(viewPager, smoothScroll);
        } catch (Exception e) {
            return this;
        }
    }

    @Override
    public BottomNavigationViewInner enableShiftingMode(int position, boolean enable) {
        try {
            return super.enableShiftingMode(position, enable);
        } catch (Exception e) {
            return this;
        }
    }

    @Override
    public BottomNavigationViewInner setItemBackground(int position, int background) {
        try {
            return super.setItemBackground(position, background);
        } catch (Exception e) {
            return this;
        }
    }

    @Override
    public BottomNavigationViewInner setIconTintList(int position, ColorStateList tint) {
        try {
            return super.setIconTintList(position, tint);
        } catch (Exception e) {
            return this;
        }
    }

    @Override
    public BottomNavigationViewInner setTextTintList(int position, ColorStateList tint) {
        try {
            return super.setTextTintList(position, tint);
        } catch (Exception e) {
            return this;
        }
    }

    @Override
    public BottomNavigationViewInner setIconsMarginTop(int marginTop) {
        try {
            return super.setIconsMarginTop(marginTop);
        } catch (Exception e) {
            return this;
        }
    }

    @Override
    public BottomNavigationViewInner setIconMarginTop(int position, int marginTop) {
        try {
            return super.setIconMarginTop(position, marginTop);
        } catch (Exception e) {
            return this;
        }
    }


    /* -----------------------///[BezierCurve]--------------------- */
    ///https://mlog.club/article/740643
    ///https://proandroiddev.com/how-i-drew-custom-shapes-in-bottom-bar-c4539d86afd7

    /** the CURVE_CIRCLE_RADIUS represent the radius of the fab button */
    private int mBezierCurveCircleRadius;   ///0:no Curve, 20 - 45
    public void setBezierCurveCircleRadius(int bezierCurveCircleRadius) {
        mBezierCurveCircleRadius = bezierCurveCircleRadius;
    }
    private View mAnchorView;
    public void setAnchorView(View anchorView) {
        mAnchorView = anchorView;
    }

    private Path mPath;
    private Paint mPaint;

    // the coordinates of the first curve
    private final Point mFirstCurveStartPoint = new Point();
    private final Point mFirstCurveEndPoint = new Point();
    private final Point mFirstCurveControlPoint1 = new Point();
    private final Point mFirstCurveControlPoint2 = new Point();

    //the coordinates of the second curve
    @SuppressWarnings("FieldCanBeLocal")
    private Point mSecondCurveStartPoint = new Point();
    private final Point mSecondCurveEndPoint = new Point();
    private final Point mSecondCurveControlPoint1 = new Point();
    private final Point mSecondCurveControlPoint2 = new Point();
    private int mNavigationBarHeight;

    private void init() {
        mPath = new Path();
        mPaint = new Paint();
        mPaint.setStyle(Paint.Style.FILL_AND_STROKE);
        mPaint.setColor(getBackgroundColor());
        setBackgroundColor(Color.TRANSPARENT);
    }

    @ColorInt
    private int getBackgroundColor() {
        if (getBackground() instanceof MaterialShapeDrawable) {
            ColorStateList colorStateList = ((MaterialShapeDrawable) getBackground()).getFillColor();
            if (colorStateList != null) {
                return colorStateList.getDefaultColor();
            }
        } else if (getBackground() instanceof ColorDrawable) {
            return ((ColorDrawable) getBackground()).getColor();
        }

        return Color.TRANSPARENT;
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);

        if (!changed) {
            return;
        }

        ///[BezierCurve#AnchorView]
        if (mAnchorView != null && mAnchorView.getHeight() > 0 && mAnchorView.getY() > 0) {
            mBezierCurveCircleRadius = (int) (mAnchorView.getHeight() + mAnchorView.getY() - getY());
        }

        if (mBezierCurveCircleRadius != 0) {
            // get width and height of navigation bar
            // Navigation bar bounds (width & height)
            int navigationBarWidth = getWidth();
            mNavigationBarHeight = getHeight();

            // the coordinates (x,y) of the start point before curve
            mFirstCurveStartPoint.set((navigationBarWidth / 2) - (mBezierCurveCircleRadius * 2) - (mBezierCurveCircleRadius / 3), 0);
            // the coordinates (x,y) of the end point after curve
            mFirstCurveEndPoint.set(navigationBarWidth / 2, mBezierCurveCircleRadius + (mBezierCurveCircleRadius / 4));
            // same thing for the second curve
            mSecondCurveStartPoint = mFirstCurveEndPoint;
            mSecondCurveEndPoint.set((navigationBarWidth / 2) + (mBezierCurveCircleRadius * 2) + (mBezierCurveCircleRadius / 3), 0);

            // the coordinates (x,y)  of the 1st control point on a cubic curve
            mFirstCurveControlPoint1.set(mFirstCurveStartPoint.x + mBezierCurveCircleRadius + (mBezierCurveCircleRadius / 4), mFirstCurveStartPoint.y);
            // the coordinates (x,y)  of the 2nd control point on a cubic curve
            mFirstCurveControlPoint2.set(mFirstCurveEndPoint.x - (mBezierCurveCircleRadius * 2) + mBezierCurveCircleRadius, mFirstCurveEndPoint.y);

            mSecondCurveControlPoint1.set(mSecondCurveStartPoint.x + (mBezierCurveCircleRadius * 2) - mBezierCurveCircleRadius, mSecondCurveStartPoint.y);
            mSecondCurveControlPoint2.set(mSecondCurveEndPoint.x - (mBezierCurveCircleRadius + (mBezierCurveCircleRadius / 4)), mSecondCurveEndPoint.y);

            mPath.reset();
            mPath.moveTo(0, 0);
            mPath.lineTo(mFirstCurveStartPoint.x, mFirstCurveStartPoint.y);

            mPath.cubicTo(mFirstCurveControlPoint1.x, mFirstCurveControlPoint1.y,
                    mFirstCurveControlPoint2.x, mFirstCurveControlPoint2.y,
                    mFirstCurveEndPoint.x, mFirstCurveEndPoint.y);

            mPath.cubicTo(mSecondCurveControlPoint1.x, mSecondCurveControlPoint1.y,
                    mSecondCurveControlPoint2.x, mSecondCurveControlPoint2.y,
                    mSecondCurveEndPoint.x, mSecondCurveEndPoint.y);

            mPath.lineTo(navigationBarWidth, 0);
            mPath.lineTo(navigationBarWidth, mNavigationBarHeight);
            mPath.lineTo(0, mNavigationBarHeight);
            mPath.close();
        }
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        if (mBezierCurveCircleRadius != 0) {
            canvas.drawPath(mPath, mPaint);
        }
    }

}