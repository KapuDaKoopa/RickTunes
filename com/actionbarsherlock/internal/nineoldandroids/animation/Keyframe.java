package com.actionbarsherlock.internal.nineoldandroids.animation;

import android.view.animation.Interpolator;

public abstract class Keyframe implements Cloneable {
    float mFraction;
    boolean mHasValue;
    private Interpolator mInterpolator;
    Class mValueType;

    class FloatKeyframe extends Keyframe {
        float mValue;

        FloatKeyframe(float f) {
            this.mFraction = f;
            this.mValueType = Float.TYPE;
        }

        FloatKeyframe(float f, float f2) {
            this.mFraction = f;
            this.mValue = f2;
            this.mValueType = Float.TYPE;
            this.mHasValue = true;
        }

        public FloatKeyframe clone() {
            FloatKeyframe floatKeyframe = new FloatKeyframe(getFraction(), this.mValue);
            floatKeyframe.setInterpolator(getInterpolator());
            return floatKeyframe;
        }

        public float getFloatValue() {
            return this.mValue;
        }

        public Object getValue() {
            return Float.valueOf(this.mValue);
        }

        public void setValue(Object obj) {
            if (obj != null && obj.getClass() == Float.class) {
                this.mValue = ((Float) obj).floatValue();
                this.mHasValue = true;
            }
        }
    }

    class IntKeyframe extends Keyframe {
        int mValue;

        IntKeyframe(float f) {
            this.mFraction = f;
            this.mValueType = Integer.TYPE;
        }

        IntKeyframe(float f, int i) {
            this.mFraction = f;
            this.mValue = i;
            this.mValueType = Integer.TYPE;
            this.mHasValue = true;
        }

        public IntKeyframe clone() {
            IntKeyframe intKeyframe = new IntKeyframe(getFraction(), this.mValue);
            intKeyframe.setInterpolator(getInterpolator());
            return intKeyframe;
        }

        public int getIntValue() {
            return this.mValue;
        }

        public Object getValue() {
            return Integer.valueOf(this.mValue);
        }

        public void setValue(Object obj) {
            if (obj != null && obj.getClass() == Integer.class) {
                this.mValue = ((Integer) obj).intValue();
                this.mHasValue = true;
            }
        }
    }

    class ObjectKeyframe extends Keyframe {
        Object mValue;

        ObjectKeyframe(float f, Object obj) {
            this.mFraction = f;
            this.mValue = obj;
            this.mHasValue = obj != null;
            this.mValueType = this.mHasValue ? obj.getClass() : Object.class;
        }

        public ObjectKeyframe clone() {
            ObjectKeyframe objectKeyframe = new ObjectKeyframe(getFraction(), this.mValue);
            objectKeyframe.setInterpolator(getInterpolator());
            return objectKeyframe;
        }

        public Object getValue() {
            return this.mValue;
        }

        public void setValue(Object obj) {
            this.mValue = obj;
            this.mHasValue = obj != null;
        }
    }

    public Keyframe() {
        this.mInterpolator = null;
        this.mHasValue = false;
    }

    public static Keyframe ofFloat(float f) {
        return new FloatKeyframe(f);
    }

    public static Keyframe ofFloat(float f, float f2) {
        return new FloatKeyframe(f, f2);
    }

    public static Keyframe ofInt(float f) {
        return new IntKeyframe(f);
    }

    public static Keyframe ofInt(float f, int i) {
        return new IntKeyframe(f, i);
    }

    public static Keyframe ofObject(float f) {
        return new ObjectKeyframe(f, null);
    }

    public static Keyframe ofObject(float f, Object obj) {
        return new ObjectKeyframe(f, obj);
    }

    public abstract Keyframe clone();

    public float getFraction() {
        return this.mFraction;
    }

    public Interpolator getInterpolator() {
        return this.mInterpolator;
    }

    public Class getType() {
        return this.mValueType;
    }

    public abstract Object getValue();

    public boolean hasValue() {
        return this.mHasValue;
    }

    public void setFraction(float f) {
        this.mFraction = f;
    }

    public void setInterpolator(Interpolator interpolator) {
        this.mInterpolator = interpolator;
    }

    public abstract void setValue(Object obj);
}
