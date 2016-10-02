package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.v4.view.an;
import android.support.v4.view.bb;
import android.support.v7.p003a.C0140b;
import android.support.v7.p003a.C0141c;
import android.util.AttributeSet;
import android.util.LogPrinter;
import android.util.Pair;
import android.util.Printer;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import com.google.android.gms.C0772e;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GridLayout extends ViewGroup {
    private static final int ALIGNMENT_MODE = 4;
    public static final int ALIGN_BOUNDS = 0;
    public static final int ALIGN_MARGINS = 1;
    public static final Alignment BASELINE;
    public static final Alignment BOTTOM;
    private static final int CAN_STRETCH = 2;
    public static final Alignment CENTER;
    private static final int COLUMN_COUNT = 2;
    private static final int COLUMN_ORDER_PRESERVED = 6;
    private static final int DEFAULT_ALIGNMENT_MODE = 1;
    static final int DEFAULT_CONTAINER_MARGIN = 0;
    private static final int DEFAULT_COUNT = Integer.MIN_VALUE;
    private static final boolean DEFAULT_ORDER_PRESERVED = true;
    private static final int DEFAULT_ORIENTATION = 0;
    private static final boolean DEFAULT_USE_DEFAULT_MARGINS = false;
    public static final Alignment END;
    public static final Alignment FILL;
    public static final int HORIZONTAL = 0;
    private static final int INFLEXIBLE = 0;
    private static final Alignment LEADING;
    public static final Alignment LEFT;
    static final Printer LOG_PRINTER;
    static final int MAX_SIZE = 100000;
    static final Printer NO_PRINTER;
    private static final int ORIENTATION = 0;
    public static final Alignment RIGHT;
    private static final int ROW_COUNT = 1;
    private static final int ROW_ORDER_PRESERVED = 5;
    public static final Alignment START;
    public static final Alignment TOP;
    private static final Alignment TRAILING;
    public static final int UNDEFINED = Integer.MIN_VALUE;
    static final Alignment UNDEFINED_ALIGNMENT;
    static final int UNINITIALIZED_HASH = 0;
    private static final int USE_DEFAULT_MARGINS = 3;
    public static final int VERTICAL = 1;
    int mAlignmentMode;
    int mDefaultGap;
    final Axis mHorizontalAxis;
    int mLastLayoutParamsHashCode;
    int mOrientation;
    Printer mPrinter;
    boolean mUseDefaultMargins;
    final Axis mVerticalAxis;

    /* renamed from: android.support.v7.widget.GridLayout.1 */
    final class C01421 implements Printer {
        C01421() {
        }

        public final void println(String str) {
        }
    }

    public abstract class Alignment {
        Alignment() {
        }

        abstract int getAlignmentValue(View view, int i, int i2);

        Bounds getBounds() {
            return new Bounds();
        }

        abstract int getGravityOffset(View view, int i);

        int getSizeInCell(View view, int i, int i2) {
            return i;
        }
    }

    /* renamed from: android.support.v7.widget.GridLayout.2 */
    final class C01432 extends Alignment {
        C01432() {
        }

        public final int getAlignmentValue(View view, int i, int i2) {
            return GridLayout.UNDEFINED;
        }

        final int getGravityOffset(View view, int i) {
            return GridLayout.UNDEFINED;
        }
    }

    /* renamed from: android.support.v7.widget.GridLayout.3 */
    final class C01443 extends Alignment {
        C01443() {
        }

        public final int getAlignmentValue(View view, int i, int i2) {
            return GridLayout.UNINITIALIZED_HASH;
        }

        final int getGravityOffset(View view, int i) {
            return GridLayout.UNINITIALIZED_HASH;
        }
    }

    /* renamed from: android.support.v7.widget.GridLayout.4 */
    final class C01454 extends Alignment {
        C01454() {
        }

        public final int getAlignmentValue(View view, int i, int i2) {
            return i;
        }

        final int getGravityOffset(View view, int i) {
            return i;
        }
    }

    /* renamed from: android.support.v7.widget.GridLayout.5 */
    final class C01465 extends Alignment {
        final /* synthetic */ Alignment val$ltr;
        final /* synthetic */ Alignment val$rtl;

        C01465(Alignment alignment, Alignment alignment2) {
            this.val$ltr = alignment;
            this.val$rtl = alignment2;
        }

        public final int getAlignmentValue(View view, int i, int i2) {
            Object obj = GridLayout.VERTICAL;
            if (an.m375f(view) != GridLayout.VERTICAL) {
                obj = null;
            }
            return (obj == null ? this.val$ltr : this.val$rtl).getAlignmentValue(view, i, i2);
        }

        final int getGravityOffset(View view, int i) {
            Object obj = GridLayout.VERTICAL;
            if (an.m375f(view) != GridLayout.VERTICAL) {
                obj = null;
            }
            return (obj == null ? this.val$ltr : this.val$rtl).getGravityOffset(view, i);
        }
    }

    /* renamed from: android.support.v7.widget.GridLayout.6 */
    final class C01476 extends Alignment {
        C01476() {
        }

        public final int getAlignmentValue(View view, int i, int i2) {
            return i >> GridLayout.VERTICAL;
        }

        final int getGravityOffset(View view, int i) {
            return i >> GridLayout.VERTICAL;
        }
    }

    class Bounds {
        public int after;
        public int before;
        public int flexibility;

        private Bounds() {
            reset();
        }

        protected int getOffset(GridLayout gridLayout, View view, Alignment alignment, int i, boolean z) {
            return this.before - alignment.getAlignmentValue(view, i, bb.m466b(gridLayout));
        }

        protected void include(int i, int i2) {
            this.before = Math.max(this.before, i);
            this.after = Math.max(this.after, i2);
        }

        protected final void include(GridLayout gridLayout, View view, Spec spec, Axis axis) {
            this.flexibility &= spec.getFlexibility();
            boolean z = axis.horizontal;
            int measurementIncludingMargin = gridLayout.getMeasurementIncludingMargin(view, z);
            int alignmentValue = gridLayout.getAlignment(spec.alignment, z).getAlignmentValue(view, measurementIncludingMargin, bb.m466b(gridLayout));
            include(alignmentValue, measurementIncludingMargin - alignmentValue);
        }

        protected void reset() {
            this.before = GridLayout.UNDEFINED;
            this.after = GridLayout.UNDEFINED;
            this.flexibility = GridLayout.COLUMN_COUNT;
        }

        protected int size(boolean z) {
            return (z || !GridLayout.canStretch(this.flexibility)) ? this.before + this.after : GridLayout.MAX_SIZE;
        }

        public String toString() {
            return "Bounds{before=" + this.before + ", after=" + this.after + '}';
        }
    }

    /* renamed from: android.support.v7.widget.GridLayout.7 */
    final class C01497 extends Alignment {

        /* renamed from: android.support.v7.widget.GridLayout.7.1 */
        class C01481 extends Bounds {
            private int size;

            C01481() {
                super();
            }

            protected int getOffset(GridLayout gridLayout, View view, Alignment alignment, int i, boolean z) {
                return Math.max(GridLayout.UNINITIALIZED_HASH, super.getOffset(gridLayout, view, alignment, i, z));
            }

            protected void include(int i, int i2) {
                super.include(i, i2);
                this.size = Math.max(this.size, i + i2);
            }

            protected void reset() {
                super.reset();
                this.size = GridLayout.UNDEFINED;
            }

            protected int size(boolean z) {
                return Math.max(super.size(z), this.size);
            }
        }

        C01497() {
        }

        public final int getAlignmentValue(View view, int i, int i2) {
            if (view.getVisibility() == 8) {
                return GridLayout.UNINITIALIZED_HASH;
            }
            int baseline = view.getBaseline();
            return baseline == -1 ? GridLayout.UNDEFINED : baseline;
        }

        public final Bounds getBounds() {
            return new C01481();
        }

        final int getGravityOffset(View view, int i) {
            return GridLayout.UNINITIALIZED_HASH;
        }
    }

    /* renamed from: android.support.v7.widget.GridLayout.8 */
    final class C01508 extends Alignment {
        C01508() {
        }

        public final int getAlignmentValue(View view, int i, int i2) {
            return GridLayout.UNDEFINED;
        }

        final int getGravityOffset(View view, int i) {
            return GridLayout.UNINITIALIZED_HASH;
        }

        public final int getSizeInCell(View view, int i, int i2) {
            return i2;
        }
    }

    final class Arc {
        public final Interval span;
        public boolean valid;
        public final MutableInt value;

        public Arc(Interval interval, MutableInt mutableInt) {
            this.valid = GridLayout.DEFAULT_ORDER_PRESERVED;
            this.span = interval;
            this.value = mutableInt;
        }

        public final String toString() {
            return this.span + " " + (!this.valid ? "+>" : "->") + " " + this.value;
        }
    }

    final class Assoc extends ArrayList {
        private final Class keyType;
        private final Class valueType;

        private Assoc(Class cls, Class cls2) {
            this.keyType = cls;
            this.valueType = cls2;
        }

        public static Assoc of(Class cls, Class cls2) {
            return new Assoc(cls, cls2);
        }

        public final PackedMap pack() {
            int size = size();
            Object[] objArr = (Object[]) Array.newInstance(this.keyType, size);
            Object[] objArr2 = (Object[]) Array.newInstance(this.valueType, size);
            for (int i = GridLayout.UNINITIALIZED_HASH; i < size; i += GridLayout.VERTICAL) {
                objArr[i] = ((Pair) get(i)).first;
                objArr2[i] = ((Pair) get(i)).second;
            }
            return new PackedMap(objArr2, null);
        }

        public final void put(Object obj, Object obj2) {
            add(Pair.create(obj, obj2));
        }
    }

    final class Axis {
        static final /* synthetic */ boolean $assertionsDisabled;
        private static final int COMPLETE = 2;
        private static final int NEW = 0;
        private static final int PENDING = 1;
        public Arc[] arcs;
        public boolean arcsValid;
        PackedMap backwardLinks;
        public boolean backwardLinksValid;
        public int definedCount;
        PackedMap forwardLinks;
        public boolean forwardLinksValid;
        PackedMap groupBounds;
        public boolean groupBoundsValid;
        public final boolean horizontal;
        public int[] leadingMargins;
        public boolean leadingMarginsValid;
        public int[] locations;
        public boolean locationsValid;
        private int maxIndex;
        boolean orderPreserved;
        private MutableInt parentMax;
        private MutableInt parentMin;
        public int[] trailingMargins;
        public boolean trailingMarginsValid;

        /* renamed from: android.support.v7.widget.GridLayout.Axis.1 */
        class C01511 {
            static final /* synthetic */ boolean $assertionsDisabled;
            Arc[][] arcsByVertex;
            int cursor;
            Arc[] result;
            final /* synthetic */ Arc[] val$arcs;
            int[] visited;

            static {
                $assertionsDisabled = !GridLayout.class.desiredAssertionStatus() ? GridLayout.DEFAULT_ORDER_PRESERVED : Axis.$assertionsDisabled;
            }

            C01511(Arc[] arcArr) {
                this.val$arcs = arcArr;
                this.result = new Arc[this.val$arcs.length];
                this.cursor = this.result.length - 1;
                this.arcsByVertex = Axis.this.groupArcsByFirstVertex(this.val$arcs);
                this.visited = new int[(Axis.this.getCount() + Axis.PENDING)];
            }

            Arc[] sort() {
                int length = this.arcsByVertex.length;
                for (int i = Axis.NEW; i < length; i += Axis.PENDING) {
                    walk(i);
                }
                if ($assertionsDisabled || this.cursor == -1) {
                    return this.result;
                }
                throw new AssertionError();
            }

            void walk(int i) {
                switch (this.visited[i]) {
                    case Axis.NEW /*0*/:
                        this.visited[i] = Axis.PENDING;
                        Arc[] arcArr = this.arcsByVertex[i];
                        int length = arcArr.length;
                        for (int i2 = Axis.NEW; i2 < length; i2 += Axis.PENDING) {
                            Arc arc = arcArr[i2];
                            walk(arc.span.max);
                            Arc[] arcArr2 = this.result;
                            int i3 = this.cursor;
                            this.cursor = i3 - 1;
                            arcArr2[i3] = arc;
                        }
                        this.visited[i] = Axis.COMPLETE;
                    case Axis.PENDING /*1*/:
                        if (!$assertionsDisabled) {
                            throw new AssertionError();
                        }
                    default:
                }
            }
        }

        static {
            $assertionsDisabled = !GridLayout.class.desiredAssertionStatus() ? GridLayout.DEFAULT_ORDER_PRESERVED : $assertionsDisabled;
        }

        private Axis(boolean z) {
            this.definedCount = GridLayout.UNDEFINED;
            this.maxIndex = GridLayout.UNDEFINED;
            this.groupBoundsValid = $assertionsDisabled;
            this.forwardLinksValid = $assertionsDisabled;
            this.backwardLinksValid = $assertionsDisabled;
            this.leadingMarginsValid = $assertionsDisabled;
            this.trailingMarginsValid = $assertionsDisabled;
            this.arcsValid = $assertionsDisabled;
            this.locationsValid = $assertionsDisabled;
            this.orderPreserved = GridLayout.DEFAULT_ORDER_PRESERVED;
            this.parentMin = new MutableInt(NEW);
            this.parentMax = new MutableInt(-100000);
            this.horizontal = z;
        }

        private void addComponentSizes(List list, PackedMap packedMap) {
            for (int i = NEW; i < ((Interval[]) packedMap.keys).length; i += PENDING) {
                include(list, ((Interval[]) packedMap.keys)[i], ((MutableInt[]) packedMap.values)[i], $assertionsDisabled);
            }
        }

        private String arcsToString(List list) {
            String str = this.horizontal ? "x" : "y";
            StringBuilder stringBuilder = new StringBuilder();
            StringBuilder stringBuilder2 = stringBuilder;
            Object obj = PENDING;
            for (Arc arc : list) {
                if (obj != null) {
                    obj = null;
                } else {
                    stringBuilder2 = stringBuilder2.append(", ");
                }
                int i = arc.span.min;
                int i2 = arc.span.max;
                int i3 = arc.value.value;
                stringBuilder2.append(i < i2 ? str + i2 + "-" + str + i + ">=" + i3 : str + i + "-" + str + i2 + "<=" + (-i3));
            }
            return stringBuilder2.toString();
        }

        private int calculateMaxIndex() {
            int childCount = GridLayout.this.getChildCount();
            int i = -1;
            for (int i2 = NEW; i2 < childCount; i2 += PENDING) {
                LayoutParams layoutParams = GridLayout.this.getLayoutParams(GridLayout.this.getChildAt(i2));
                Interval interval = (this.horizontal ? layoutParams.columnSpec : layoutParams.rowSpec).span;
                i = Math.max(Math.max(Math.max(i, interval.min), interval.max), interval.size());
            }
            return i == -1 ? GridLayout.UNDEFINED : i;
        }

        private void computeArcs() {
            getForwardLinks();
            getBackwardLinks();
        }

        private void computeGroupBounds() {
            int i = NEW;
            Bounds[] boundsArr = (Bounds[]) this.groupBounds.values;
            for (int i2 = NEW; i2 < boundsArr.length; i2 += PENDING) {
                boundsArr[i2].reset();
            }
            int childCount = GridLayout.this.getChildCount();
            while (i < childCount) {
                View childAt = GridLayout.this.getChildAt(i);
                LayoutParams layoutParams = GridLayout.this.getLayoutParams(childAt);
                ((Bounds) this.groupBounds.getValue(i)).include(GridLayout.this, childAt, this.horizontal ? layoutParams.columnSpec : layoutParams.rowSpec, this);
                i += PENDING;
            }
        }

        private void computeLinks(PackedMap packedMap, boolean z) {
            int i = NEW;
            MutableInt[] mutableIntArr = (MutableInt[]) packedMap.values;
            for (int i2 = NEW; i2 < mutableIntArr.length; i2 += PENDING) {
                mutableIntArr[i2].reset();
            }
            Bounds[] boundsArr = (Bounds[]) getGroupBounds().values;
            while (i < boundsArr.length) {
                int size = boundsArr[i].size(z);
                MutableInt mutableInt = (MutableInt) packedMap.getValue(i);
                int i3 = mutableInt.value;
                if (!z) {
                    size = -size;
                }
                mutableInt.value = Math.max(i3, size);
                i += PENDING;
            }
        }

        private void computeLocations(int[] iArr) {
            int i = NEW;
            solve(getArcs(), iArr);
            if (!this.orderPreserved) {
                int i2 = iArr[NEW];
                int length = iArr.length;
                while (i < length) {
                    iArr[i] = iArr[i] - i2;
                    i += PENDING;
                }
            }
        }

        private void computeMargins(boolean z) {
            int[] iArr = z ? this.leadingMargins : this.trailingMargins;
            int childCount = GridLayout.this.getChildCount();
            for (int i = NEW; i < childCount; i += PENDING) {
                View childAt = GridLayout.this.getChildAt(i);
                if (childAt.getVisibility() != 8) {
                    LayoutParams layoutParams = GridLayout.this.getLayoutParams(childAt);
                    Interval interval = (this.horizontal ? layoutParams.columnSpec : layoutParams.rowSpec).span;
                    int i2 = z ? interval.min : interval.max;
                    iArr[i2] = Math.max(iArr[i2], GridLayout.this.getMargin1(childAt, this.horizontal, z));
                }
            }
        }

        private Arc[] createArcs() {
            int i;
            List arrayList = new ArrayList();
            List arrayList2 = new ArrayList();
            addComponentSizes(arrayList, getForwardLinks());
            addComponentSizes(arrayList2, getBackwardLinks());
            if (this.orderPreserved) {
                for (i = NEW; i < getCount(); i += PENDING) {
                    include(arrayList, new Interval(i, i + PENDING), new MutableInt(NEW));
                }
            }
            i = getCount();
            include(arrayList, new Interval(NEW, i), this.parentMin, $assertionsDisabled);
            include(arrayList2, new Interval(i, NEW), this.parentMax, $assertionsDisabled);
            return (Arc[]) GridLayout.append(topologicalSort(arrayList), topologicalSort(arrayList2));
        }

        private PackedMap createGroupBounds() {
            Assoc of = Assoc.of(Spec.class, Bounds.class);
            int childCount = GridLayout.this.getChildCount();
            for (int i = NEW; i < childCount; i += PENDING) {
                LayoutParams layoutParams = GridLayout.this.getLayoutParams(GridLayout.this.getChildAt(i));
                Spec spec = this.horizontal ? layoutParams.columnSpec : layoutParams.rowSpec;
                of.put(spec, GridLayout.this.getAlignment(spec.alignment, this.horizontal).getBounds());
            }
            return of.pack();
        }

        private PackedMap createLinks(boolean z) {
            Assoc of = Assoc.of(Interval.class, MutableInt.class);
            Spec[] specArr = (Spec[]) getGroupBounds().keys;
            int length = specArr.length;
            for (int i = NEW; i < length; i += PENDING) {
                of.put(z ? specArr[i].span : specArr[i].span.inverse(), new MutableInt());
            }
            return of.pack();
        }

        private PackedMap getBackwardLinks() {
            if (this.backwardLinks == null) {
                this.backwardLinks = createLinks($assertionsDisabled);
            }
            if (!this.backwardLinksValid) {
                computeLinks(this.backwardLinks, $assertionsDisabled);
                this.backwardLinksValid = GridLayout.DEFAULT_ORDER_PRESERVED;
            }
            return this.backwardLinks;
        }

        private PackedMap getForwardLinks() {
            if (this.forwardLinks == null) {
                this.forwardLinks = createLinks(GridLayout.DEFAULT_ORDER_PRESERVED);
            }
            if (!this.forwardLinksValid) {
                computeLinks(this.forwardLinks, GridLayout.DEFAULT_ORDER_PRESERVED);
                this.forwardLinksValid = GridLayout.DEFAULT_ORDER_PRESERVED;
            }
            return this.forwardLinks;
        }

        private int getMaxIndex() {
            if (this.maxIndex == GridLayout.UNDEFINED) {
                this.maxIndex = Math.max(NEW, calculateMaxIndex());
            }
            return this.maxIndex;
        }

        private int getMeasure(int i, int i2) {
            setParentConstraints(i, i2);
            return size(getLocations());
        }

        private void include(List list, Interval interval, MutableInt mutableInt) {
            include(list, interval, mutableInt, GridLayout.DEFAULT_ORDER_PRESERVED);
        }

        private void include(List list, Interval interval, MutableInt mutableInt, boolean z) {
            if (interval.size() != 0) {
                if (z) {
                    for (Arc arc : list) {
                        if (arc.span.equals(interval)) {
                            return;
                        }
                    }
                }
                list.add(new Arc(interval, mutableInt));
            }
        }

        private void init(int[] iArr) {
            Arrays.fill(iArr, NEW);
        }

        private void logError(String str, Arc[] arcArr, boolean[] zArr) {
            List arrayList = new ArrayList();
            List arrayList2 = new ArrayList();
            for (int i = NEW; i < arcArr.length; i += PENDING) {
                Arc arc = arcArr[i];
                if (zArr[i]) {
                    arrayList.add(arc);
                }
                if (!arc.valid) {
                    arrayList2.add(arc);
                }
            }
            GridLayout.this.mPrinter.println(str + " constraints: " + arcsToString(arrayList) + " are inconsistent; permanently removing: " + arcsToString(arrayList2) + ". ");
        }

        private boolean relax(int[] iArr, Arc arc) {
            if (!arc.valid) {
                return $assertionsDisabled;
            }
            Interval interval = arc.span;
            int i = interval.min;
            int i2 = interval.max;
            i = iArr[i] + arc.value.value;
            if (i <= iArr[i2]) {
                return $assertionsDisabled;
            }
            iArr[i2] = i;
            return GridLayout.DEFAULT_ORDER_PRESERVED;
        }

        private void setParentConstraints(int i, int i2) {
            this.parentMin.value = i;
            this.parentMax.value = -i2;
            this.locationsValid = $assertionsDisabled;
        }

        private int size(int[] iArr) {
            return iArr[getCount()];
        }

        private void solve(Arc[] arcArr, int[] iArr) {
            String str = this.horizontal ? "horizontal" : "vertical";
            int count = getCount() + PENDING;
            boolean[] zArr = null;
            for (int i = NEW; i < arcArr.length; i += PENDING) {
                Arrays.fill(iArr, NEW);
                int i2 = NEW;
                while (i2 < count) {
                    int i3 = NEW;
                    for (int i4 = NEW; i4 < arcArr.length; i4 += PENDING) {
                        i3 |= relax(iArr, arcArr[i4]);
                    }
                    if (i3 != 0) {
                        i2 += PENDING;
                    } else if (zArr != null) {
                        logError(str, arcArr, zArr);
                        return;
                    } else {
                        return;
                    }
                }
                boolean[] zArr2 = new boolean[arcArr.length];
                for (i2 = NEW; i2 < count; i2 += PENDING) {
                    int length = arcArr.length;
                    for (i3 = NEW; i3 < length; i3 += PENDING) {
                        zArr2[i3] = zArr2[i3] | relax(iArr, arcArr[i3]);
                    }
                }
                if (i == 0) {
                    zArr = zArr2;
                }
                for (i3 = NEW; i3 < arcArr.length; i3 += PENDING) {
                    if (zArr2[i3]) {
                        Arc arc = arcArr[i3];
                        if (arc.span.min >= arc.span.max) {
                            arc.valid = $assertionsDisabled;
                            break;
                        }
                    }
                }
            }
        }

        private Arc[] topologicalSort(List list) {
            return topologicalSort((Arc[]) list.toArray(new Arc[list.size()]));
        }

        private Arc[] topologicalSort(Arc[] arcArr) {
            return new C01511(arcArr).sort();
        }

        public final Arc[] getArcs() {
            if (this.arcs == null) {
                this.arcs = createArcs();
            }
            if (!this.arcsValid) {
                computeArcs();
                this.arcsValid = GridLayout.DEFAULT_ORDER_PRESERVED;
            }
            return this.arcs;
        }

        public final int getCount() {
            return Math.max(this.definedCount, getMaxIndex());
        }

        public final PackedMap getGroupBounds() {
            if (this.groupBounds == null) {
                this.groupBounds = createGroupBounds();
            }
            if (!this.groupBoundsValid) {
                computeGroupBounds();
                this.groupBoundsValid = GridLayout.DEFAULT_ORDER_PRESERVED;
            }
            return this.groupBounds;
        }

        public final int[] getLeadingMargins() {
            if (this.leadingMargins == null) {
                this.leadingMargins = new int[(getCount() + PENDING)];
            }
            if (!this.leadingMarginsValid) {
                computeMargins(GridLayout.DEFAULT_ORDER_PRESERVED);
                this.leadingMarginsValid = GridLayout.DEFAULT_ORDER_PRESERVED;
            }
            return this.leadingMargins;
        }

        public final int[] getLocations() {
            if (this.locations == null) {
                this.locations = new int[(getCount() + PENDING)];
            }
            if (!this.locationsValid) {
                computeLocations(this.locations);
                this.locationsValid = GridLayout.DEFAULT_ORDER_PRESERVED;
            }
            return this.locations;
        }

        public final int getMeasure(int i) {
            int mode = MeasureSpec.getMode(i);
            int size = MeasureSpec.getSize(i);
            switch (mode) {
                case GridLayout.UNDEFINED /*-2147483648*/:
                    return getMeasure(NEW, size);
                case NEW /*0*/:
                    return getMeasure(NEW, GridLayout.MAX_SIZE);
                case 1073741824:
                    return getMeasure(size, size);
                default:
                    if ($assertionsDisabled) {
                        return NEW;
                    }
                    throw new AssertionError();
            }
        }

        public final int[] getTrailingMargins() {
            if (this.trailingMargins == null) {
                this.trailingMargins = new int[(getCount() + PENDING)];
            }
            if (!this.trailingMarginsValid) {
                computeMargins($assertionsDisabled);
                this.trailingMarginsValid = GridLayout.DEFAULT_ORDER_PRESERVED;
            }
            return this.trailingMargins;
        }

        final Arc[][] groupArcsByFirstVertex(Arc[] arcArr) {
            int i = NEW;
            int count = getCount() + PENDING;
            Arc[][] arcArr2 = new Arc[count][];
            int[] iArr = new int[count];
            int length = arcArr.length;
            for (count = NEW; count < length; count += PENDING) {
                int i2 = arcArr[count].span.min;
                iArr[i2] = iArr[i2] + PENDING;
            }
            for (count = NEW; count < iArr.length; count += PENDING) {
                arcArr2[count] = new Arc[iArr[count]];
            }
            Arrays.fill(iArr, NEW);
            count = arcArr.length;
            while (i < count) {
                Arc arc = arcArr[i];
                i2 = arc.span.min;
                Arc[] arcArr3 = arcArr2[i2];
                int i3 = iArr[i2];
                iArr[i2] = i3 + PENDING;
                arcArr3[i3] = arc;
                i += PENDING;
            }
            return arcArr2;
        }

        public final void invalidateStructure() {
            this.maxIndex = GridLayout.UNDEFINED;
            this.groupBounds = null;
            this.forwardLinks = null;
            this.backwardLinks = null;
            this.leadingMargins = null;
            this.trailingMargins = null;
            this.arcs = null;
            this.locations = null;
            invalidateValues();
        }

        public final void invalidateValues() {
            this.groupBoundsValid = $assertionsDisabled;
            this.forwardLinksValid = $assertionsDisabled;
            this.backwardLinksValid = $assertionsDisabled;
            this.leadingMarginsValid = $assertionsDisabled;
            this.trailingMarginsValid = $assertionsDisabled;
            this.arcsValid = $assertionsDisabled;
            this.locationsValid = $assertionsDisabled;
        }

        public final boolean isOrderPreserved() {
            return this.orderPreserved;
        }

        public final void layout(int i) {
            setParentConstraints(i, i);
            getLocations();
        }

        public final void setCount(int i) {
            if (i != GridLayout.UNDEFINED && i < getMaxIndex()) {
                GridLayout.handleInvalidParams((this.horizontal ? "column" : "row") + "Count must be greater than or equal to the maximum of all grid indices (and spans) defined in the LayoutParams of each child");
            }
            this.definedCount = i;
        }

        public final void setOrderPreserved(boolean z) {
            this.orderPreserved = z;
            invalidateStructure();
        }
    }

    final class Interval {
        public final int max;
        public final int min;

        public Interval(int i, int i2) {
            this.min = i;
            this.max = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return GridLayout.DEFAULT_ORDER_PRESERVED;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return GridLayout.DEFAULT_USE_DEFAULT_MARGINS;
            }
            Interval interval = (Interval) obj;
            return this.max != interval.max ? GridLayout.DEFAULT_USE_DEFAULT_MARGINS : this.min != interval.min ? GridLayout.DEFAULT_USE_DEFAULT_MARGINS : GridLayout.DEFAULT_ORDER_PRESERVED;
        }

        public final int hashCode() {
            return (this.min * 31) + this.max;
        }

        final Interval inverse() {
            return new Interval(this.max, this.min);
        }

        final int size() {
            return this.max - this.min;
        }

        public final String toString() {
            return "[" + this.min + ", " + this.max + "]";
        }
    }

    public class LayoutParams extends MarginLayoutParams {
        private static final int BOTTOM_MARGIN = 6;
        private static final int COLUMN = 9;
        private static final int COLUMN_SPAN = 10;
        private static final int DEFAULT_COLUMN = Integer.MIN_VALUE;
        private static final int DEFAULT_HEIGHT = -2;
        private static final int DEFAULT_MARGIN = Integer.MIN_VALUE;
        private static final int DEFAULT_ROW = Integer.MIN_VALUE;
        private static final Interval DEFAULT_SPAN;
        private static final int DEFAULT_SPAN_SIZE;
        private static final int DEFAULT_WIDTH = -2;
        private static final int GRAVITY = 11;
        private static final int LEFT_MARGIN = 3;
        private static final int MARGIN = 2;
        private static final int RIGHT_MARGIN = 5;
        private static final int ROW = 7;
        private static final int ROW_SPAN = 8;
        private static final int TOP_MARGIN = 4;
        public Spec columnSpec;
        public Spec rowSpec;

        static {
            Interval interval = new Interval(DEFAULT_ROW, -2147483647);
            DEFAULT_SPAN = interval;
            DEFAULT_SPAN_SIZE = interval.size();
        }

        public LayoutParams() {
            this(Spec.UNDEFINED, Spec.UNDEFINED);
        }

        private LayoutParams(int i, int i2, int i3, int i4, int i5, int i6, Spec spec, Spec spec2) {
            super(i, i2);
            this.rowSpec = Spec.UNDEFINED;
            this.columnSpec = Spec.UNDEFINED;
            setMargins(i3, i4, i5, i6);
            this.rowSpec = spec;
            this.columnSpec = spec2;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.rowSpec = Spec.UNDEFINED;
            this.columnSpec = Spec.UNDEFINED;
            reInitSuper(context, attributeSet);
            init(context, attributeSet);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
            this.rowSpec = Spec.UNDEFINED;
            this.columnSpec = Spec.UNDEFINED;
            this.rowSpec = layoutParams.rowSpec;
            this.columnSpec = layoutParams.columnSpec;
        }

        public LayoutParams(Spec spec, Spec spec2) {
            this(DEFAULT_WIDTH, DEFAULT_WIDTH, DEFAULT_ROW, DEFAULT_ROW, DEFAULT_ROW, DEFAULT_ROW, spec, spec2);
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.rowSpec = Spec.UNDEFINED;
            this.columnSpec = Spec.UNDEFINED;
        }

        public LayoutParams(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.rowSpec = Spec.UNDEFINED;
            this.columnSpec = Spec.UNDEFINED;
        }

        private void init(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0141c.GridLayout_Layout);
            try {
                int i = obtainStyledAttributes.getInt(GRAVITY, DEFAULT_SPAN_SIZE);
                this.columnSpec = GridLayout.spec(obtainStyledAttributes.getInt(COLUMN, DEFAULT_ROW), obtainStyledAttributes.getInt(COLUMN_SPAN, DEFAULT_SPAN_SIZE), GridLayout.getAlignment(i, (boolean) GridLayout.DEFAULT_ORDER_PRESERVED));
                this.rowSpec = GridLayout.spec(obtainStyledAttributes.getInt(ROW, DEFAULT_ROW), obtainStyledAttributes.getInt(ROW_SPAN, DEFAULT_SPAN_SIZE), GridLayout.getAlignment(i, (boolean) GridLayout.DEFAULT_USE_DEFAULT_MARGINS));
            } finally {
                obtainStyledAttributes.recycle();
            }
        }

        private void reInitSuper(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0141c.GridLayout_Layout);
            try {
                int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(MARGIN, DEFAULT_ROW);
                this.leftMargin = obtainStyledAttributes.getDimensionPixelSize(LEFT_MARGIN, dimensionPixelSize);
                this.topMargin = obtainStyledAttributes.getDimensionPixelSize(TOP_MARGIN, dimensionPixelSize);
                this.rightMargin = obtainStyledAttributes.getDimensionPixelSize(RIGHT_MARGIN, dimensionPixelSize);
                this.bottomMargin = obtainStyledAttributes.getDimensionPixelSize(BOTTOM_MARGIN, dimensionPixelSize);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return GridLayout.DEFAULT_ORDER_PRESERVED;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return GridLayout.DEFAULT_USE_DEFAULT_MARGINS;
            }
            LayoutParams layoutParams = (LayoutParams) obj;
            return !this.columnSpec.equals(layoutParams.columnSpec) ? GridLayout.DEFAULT_USE_DEFAULT_MARGINS : !this.rowSpec.equals(layoutParams.rowSpec) ? GridLayout.DEFAULT_USE_DEFAULT_MARGINS : GridLayout.DEFAULT_ORDER_PRESERVED;
        }

        public int hashCode() {
            return (this.rowSpec.hashCode() * 31) + this.columnSpec.hashCode();
        }

        protected void setBaseAttributes(TypedArray typedArray, int i, int i2) {
            this.width = typedArray.getLayoutDimension(i, DEFAULT_WIDTH);
            this.height = typedArray.getLayoutDimension(i2, DEFAULT_WIDTH);
        }

        final void setColumnSpecSpan(Interval interval) {
            this.columnSpec = this.columnSpec.copyWriteSpan(interval);
        }

        public void setGravity(int i) {
            this.rowSpec = this.rowSpec.copyWriteAlignment(GridLayout.getAlignment(i, (boolean) GridLayout.DEFAULT_USE_DEFAULT_MARGINS));
            this.columnSpec = this.columnSpec.copyWriteAlignment(GridLayout.getAlignment(i, (boolean) GridLayout.DEFAULT_ORDER_PRESERVED));
        }

        final void setRowSpecSpan(Interval interval) {
            this.rowSpec = this.rowSpec.copyWriteSpan(interval);
        }
    }

    final class MutableInt {
        public int value;

        public MutableInt() {
            reset();
        }

        public MutableInt(int i) {
            this.value = i;
        }

        public final void reset() {
            this.value = GridLayout.UNDEFINED;
        }

        public final String toString() {
            return Integer.toString(this.value);
        }
    }

    final class PackedMap {
        public final int[] index;
        public final Object[] keys;
        public final Object[] values;

        private PackedMap(Object[] objArr, Object[] objArr2) {
            this.index = createIndex(objArr);
            this.keys = compact(objArr, this.index);
            this.values = compact(objArr2, this.index);
        }

        private static Object[] compact(Object[] objArr, int[] iArr) {
            int length = objArr.length;
            Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), GridLayout.max2(iArr, -1) + GridLayout.VERTICAL);
            for (int i = GridLayout.UNINITIALIZED_HASH; i < length; i += GridLayout.VERTICAL) {
                objArr2[iArr[i]] = objArr[i];
            }
            return objArr2;
        }

        private static int[] createIndex(Object[] objArr) {
            int length = objArr.length;
            int[] iArr = new int[length];
            Map hashMap = new HashMap();
            for (int i = GridLayout.UNINITIALIZED_HASH; i < length; i += GridLayout.VERTICAL) {
                Object obj = objArr[i];
                Integer num = (Integer) hashMap.get(obj);
                if (num == null) {
                    num = Integer.valueOf(hashMap.size());
                    hashMap.put(obj, num);
                }
                iArr[i] = num.intValue();
            }
            return iArr;
        }

        public final Object getValue(int i) {
            return this.values[this.index[i]];
        }
    }

    public class Spec {
        static final Spec UNDEFINED;
        final Alignment alignment;
        final Interval span;
        final boolean startDefined;

        static {
            UNDEFINED = GridLayout.spec(GridLayout.UNDEFINED);
        }

        private Spec(boolean z, int i, int i2, Alignment alignment) {
            this(z, new Interval(i, i + i2), alignment);
        }

        private Spec(boolean z, Interval interval, Alignment alignment) {
            this.startDefined = z;
            this.span = interval;
            this.alignment = alignment;
        }

        final Spec copyWriteAlignment(Alignment alignment) {
            return new Spec(this.startDefined, this.span, alignment);
        }

        final Spec copyWriteSpan(Interval interval) {
            return new Spec(this.startDefined, interval, this.alignment);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return GridLayout.DEFAULT_ORDER_PRESERVED;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return GridLayout.DEFAULT_USE_DEFAULT_MARGINS;
            }
            Spec spec = (Spec) obj;
            return !this.alignment.equals(spec.alignment) ? GridLayout.DEFAULT_USE_DEFAULT_MARGINS : !this.span.equals(spec.span) ? GridLayout.DEFAULT_USE_DEFAULT_MARGINS : GridLayout.DEFAULT_ORDER_PRESERVED;
        }

        final int getFlexibility() {
            return this.alignment == GridLayout.UNDEFINED_ALIGNMENT ? GridLayout.UNINITIALIZED_HASH : GridLayout.COLUMN_COUNT;
        }

        public int hashCode() {
            return (this.span.hashCode() * 31) + this.alignment.hashCode();
        }
    }

    static {
        LOG_PRINTER = new LogPrinter(USE_DEFAULT_MARGINS, GridLayout.class.getName());
        NO_PRINTER = new C01421();
        UNDEFINED_ALIGNMENT = new C01432();
        LEADING = new C01443();
        TRAILING = new C01454();
        TOP = LEADING;
        BOTTOM = TRAILING;
        START = LEADING;
        END = TRAILING;
        LEFT = createSwitchingAlignment(START, END);
        RIGHT = createSwitchingAlignment(END, START);
        CENTER = new C01476();
        BASELINE = new C01497();
        FILL = new C01508();
    }

    public GridLayout(Context context) {
        this(context, null);
    }

    public GridLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, UNINITIALIZED_HASH);
    }

    public GridLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mHorizontalAxis = new Axis(DEFAULT_ORDER_PRESERVED, null);
        this.mVerticalAxis = new Axis(DEFAULT_USE_DEFAULT_MARGINS, null);
        this.mOrientation = UNINITIALIZED_HASH;
        this.mUseDefaultMargins = DEFAULT_USE_DEFAULT_MARGINS;
        this.mAlignmentMode = VERTICAL;
        this.mLastLayoutParamsHashCode = UNINITIALIZED_HASH;
        this.mPrinter = LOG_PRINTER;
        this.mDefaultGap = context.getResources().getDimensionPixelOffset(C0140b.default_gap);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0141c.GridLayout);
        try {
            setRowCount(obtainStyledAttributes.getInt(VERTICAL, UNDEFINED));
            setColumnCount(obtainStyledAttributes.getInt(COLUMN_COUNT, UNDEFINED));
            setOrientation(obtainStyledAttributes.getInt(UNINITIALIZED_HASH, UNINITIALIZED_HASH));
            setUseDefaultMargins(obtainStyledAttributes.getBoolean(USE_DEFAULT_MARGINS, DEFAULT_USE_DEFAULT_MARGINS));
            setAlignmentMode(obtainStyledAttributes.getInt(ALIGNMENT_MODE, VERTICAL));
            setRowOrderPreserved(obtainStyledAttributes.getBoolean(ROW_ORDER_PRESERVED, DEFAULT_ORDER_PRESERVED));
            setColumnOrderPreserved(obtainStyledAttributes.getBoolean(COLUMN_ORDER_PRESERVED, DEFAULT_ORDER_PRESERVED));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    static int adjust(int i, int i2) {
        return MeasureSpec.makeMeasureSpec(MeasureSpec.getSize(i + i2), MeasureSpec.getMode(i));
    }

    static Object[] append(Object[] objArr, Object[] objArr2) {
        Object[] objArr3 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), objArr.length + objArr2.length);
        System.arraycopy(objArr, UNINITIALIZED_HASH, objArr3, UNINITIALIZED_HASH, objArr.length);
        System.arraycopy(objArr2, UNINITIALIZED_HASH, objArr3, objArr.length, objArr2.length);
        return objArr3;
    }

    static boolean canStretch(int i) {
        return (i & COLUMN_COUNT) != 0 ? DEFAULT_ORDER_PRESERVED : DEFAULT_USE_DEFAULT_MARGINS;
    }

    private void checkLayoutParams(LayoutParams layoutParams, boolean z) {
        String str = z ? "column" : "row";
        Interval interval = (z ? layoutParams.columnSpec : layoutParams.rowSpec).span;
        if (interval.min != UNDEFINED && interval.min < 0) {
            handleInvalidParams(str + " indices must be positive");
        }
        int i = (z ? this.mHorizontalAxis : this.mVerticalAxis).definedCount;
        if (i != UNDEFINED) {
            if (interval.max > i) {
                handleInvalidParams(str + " indices (start + span) mustn't exceed the " + str + " count");
            }
            if (interval.size() > i) {
                handleInvalidParams(str + " span mustn't exceed the " + str + " count");
            }
        }
    }

    private static int clip(Interval interval, boolean z, int i) {
        int size = interval.size();
        if (i == 0) {
            return size;
        }
        return Math.min(size, i - (z ? Math.min(interval.min, i) : UNINITIALIZED_HASH));
    }

    private int computeLayoutParamsHashCode() {
        int i = VERTICAL;
        int childCount = getChildCount();
        int i2 = UNINITIALIZED_HASH;
        while (i2 < childCount) {
            int hashCode;
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                hashCode = ((LayoutParams) childAt.getLayoutParams()).hashCode() + (i * 31);
            } else {
                hashCode = i;
            }
            i2 += VERTICAL;
            i = hashCode;
        }
        return i;
    }

    private void consistencyCheck() {
        while (this.mLastLayoutParamsHashCode != 0) {
            if (this.mLastLayoutParamsHashCode != computeLayoutParamsHashCode()) {
                this.mPrinter.println("The fields of some layout parameters were modified in between layout operations. Check the javadoc for GridLayout.LayoutParams#rowSpec.");
                invalidateStructure();
            } else {
                return;
            }
        }
        validateLayoutParams();
        this.mLastLayoutParamsHashCode = computeLayoutParamsHashCode();
    }

    private static Alignment createSwitchingAlignment(Alignment alignment, Alignment alignment2) {
        return new C01465(alignment, alignment2);
    }

    private void drawLine(Canvas canvas, int i, int i2, int i3, int i4, Paint paint) {
        if (isLayoutRtlCompat()) {
            int width = getWidth();
            canvas.drawLine((float) (width - i), (float) i2, (float) (width - i3), (float) i4, paint);
            return;
        }
        canvas.drawLine((float) i, (float) i2, (float) i3, (float) i4, paint);
    }

    private static boolean fits(int[] iArr, int i, int i2, int i3) {
        if (i3 > iArr.length) {
            return DEFAULT_USE_DEFAULT_MARGINS;
        }
        while (i2 < i3) {
            if (iArr[i2] > i) {
                return DEFAULT_USE_DEFAULT_MARGINS;
            }
            i2 += VERTICAL;
        }
        return DEFAULT_ORDER_PRESERVED;
    }

    static Alignment getAlignment(int i, boolean z) {
        switch (((z ? 7 : 112) & i) >> (z ? UNINITIALIZED_HASH : ALIGNMENT_MODE)) {
            case VERTICAL /*1*/:
                return CENTER;
            case USE_DEFAULT_MARGINS /*3*/:
                return z ? LEFT : TOP;
            case ROW_ORDER_PRESERVED /*5*/:
                return z ? RIGHT : BOTTOM;
            case C0772e.WalletFragmentStyle_maskedWalletDetailsButtonTextAppearance /*7*/:
                return FILL;
            case 8388611:
                return START;
            case 8388613:
                return END;
            default:
                return UNDEFINED_ALIGNMENT;
        }
    }

    private int getDefaultMargin(View view, LayoutParams layoutParams, boolean z, boolean z2) {
        if (!this.mUseDefaultMargins) {
            return UNINITIALIZED_HASH;
        }
        int i;
        Spec spec = z ? layoutParams.columnSpec : layoutParams.rowSpec;
        Axis axis = z ? this.mHorizontalAxis : this.mVerticalAxis;
        Interval interval = spec.span;
        if (z && isLayoutRtlCompat()) {
            i = !z2 ? VERTICAL : UNINITIALIZED_HASH;
        } else {
            boolean z3 = z2;
        }
        boolean z4 = i != 0 ? interval.min == 0 ? DEFAULT_ORDER_PRESERVED : DEFAULT_USE_DEFAULT_MARGINS : interval.max == axis.getCount() ? DEFAULT_ORDER_PRESERVED : DEFAULT_USE_DEFAULT_MARGINS;
        return getDefaultMargin(view, z4, z, z2);
    }

    private int getDefaultMargin(View view, boolean z, boolean z2) {
        return view.getClass() == Space.class ? UNINITIALIZED_HASH : this.mDefaultGap / COLUMN_COUNT;
    }

    private int getDefaultMargin(View view, boolean z, boolean z2, boolean z3) {
        return getDefaultMargin(view, z2, z3);
    }

    private int getMargin(View view, boolean z, boolean z2) {
        if (this.mAlignmentMode == VERTICAL) {
            return getMargin1(view, z, z2);
        }
        Axis axis = z ? this.mHorizontalAxis : this.mVerticalAxis;
        int[] leadingMargins = z2 ? axis.getLeadingMargins() : axis.getTrailingMargins();
        LayoutParams layoutParams = getLayoutParams(view);
        Spec spec = z ? layoutParams.columnSpec : layoutParams.rowSpec;
        return leadingMargins[z2 ? spec.span.min : spec.span.max];
    }

    private int getMeasurement(View view, boolean z) {
        return z ? view.getMeasuredWidth() : view.getMeasuredHeight();
    }

    private int getTotalMargin(View view, boolean z) {
        return getMargin(view, z, DEFAULT_ORDER_PRESERVED) + getMargin(view, z, DEFAULT_USE_DEFAULT_MARGINS);
    }

    private static void handleInvalidParams(String str) {
        throw new IllegalArgumentException(str + ". ");
    }

    private void invalidateStructure() {
        this.mLastLayoutParamsHashCode = UNINITIALIZED_HASH;
        if (this.mHorizontalAxis != null) {
            this.mHorizontalAxis.invalidateStructure();
        }
        if (this.mVerticalAxis != null) {
            this.mVerticalAxis.invalidateStructure();
        }
        invalidateValues();
    }

    private void invalidateValues() {
        if (this.mHorizontalAxis != null && this.mVerticalAxis != null) {
            this.mHorizontalAxis.invalidateValues();
            this.mVerticalAxis.invalidateValues();
        }
    }

    private boolean isLayoutRtlCompat() {
        return an.m375f(this) == VERTICAL ? DEFAULT_ORDER_PRESERVED : DEFAULT_USE_DEFAULT_MARGINS;
    }

    static int max2(int[] iArr, int i) {
        int length = iArr.length;
        for (int i2 = UNINITIALIZED_HASH; i2 < length; i2 += VERTICAL) {
            i = Math.max(i, iArr[i2]);
        }
        return i;
    }

    private void measureChildWithMargins2(View view, int i, int i2, int i3, int i4) {
        view.measure(getChildMeasureSpec(i, getTotalMargin(view, DEFAULT_ORDER_PRESERVED), i3), getChildMeasureSpec(i2, getTotalMargin(view, DEFAULT_USE_DEFAULT_MARGINS), i4));
    }

    private void measureChildrenWithMargins(int i, int i2, boolean z) {
        int childCount = getChildCount();
        for (int i3 = UNINITIALIZED_HASH; i3 < childCount; i3 += VERTICAL) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = getLayoutParams(childAt);
                if (z) {
                    measureChildWithMargins2(childAt, i, i2, layoutParams.width, layoutParams.height);
                } else {
                    boolean z2 = this.mOrientation == 0 ? DEFAULT_ORDER_PRESERVED : DEFAULT_USE_DEFAULT_MARGINS;
                    Spec spec = z2 ? layoutParams.columnSpec : layoutParams.rowSpec;
                    if (spec.alignment == FILL) {
                        Interval interval = spec.span;
                        int[] locations = (z2 ? this.mHorizontalAxis : this.mVerticalAxis).getLocations();
                        int totalMargin = (locations[interval.max] - locations[interval.min]) - getTotalMargin(childAt, z2);
                        if (z2) {
                            measureChildWithMargins2(childAt, i, i2, totalMargin, layoutParams.height);
                        } else {
                            measureChildWithMargins2(childAt, i, i2, layoutParams.width, totalMargin);
                        }
                    }
                }
            }
        }
    }

    private static void procrusteanFill(int[] iArr, int i, int i2, int i3) {
        int length = iArr.length;
        Arrays.fill(iArr, Math.min(i, length), Math.min(i2, length), i3);
    }

    private static void setCellGroup(LayoutParams layoutParams, int i, int i2, int i3, int i4) {
        layoutParams.setRowSpecSpan(new Interval(i, i + i2));
        layoutParams.setColumnSpecSpan(new Interval(i3, i3 + i4));
    }

    public static Spec spec(int i) {
        return spec(i, (int) VERTICAL);
    }

    public static Spec spec(int i, int i2) {
        return spec(i, i2, UNDEFINED_ALIGNMENT);
    }

    public static Spec spec(int i, int i2, Alignment alignment) {
        return new Spec(i, i2, alignment, null);
    }

    public static Spec spec(int i, Alignment alignment) {
        return spec(i, VERTICAL, alignment);
    }

    private void validateLayoutParams() {
        Object obj = this.mOrientation == 0 ? VERTICAL : UNINITIALIZED_HASH;
        Axis axis = obj != null ? this.mHorizontalAxis : this.mVerticalAxis;
        int i = axis.definedCount != UNDEFINED ? axis.definedCount : UNINITIALIZED_HASH;
        int[] iArr = new int[i];
        int childCount = getChildCount();
        int i2 = UNINITIALIZED_HASH;
        int i3 = UNINITIALIZED_HASH;
        for (int i4 = UNINITIALIZED_HASH; i4 < childCount; i4 += VERTICAL) {
            LayoutParams layoutParams = (LayoutParams) getChildAt(i4).getLayoutParams();
            Spec spec = obj != null ? layoutParams.rowSpec : layoutParams.columnSpec;
            Interval interval = spec.span;
            boolean z = spec.startDefined;
            int size = interval.size();
            if (z) {
                i3 = interval.min;
            }
            spec = obj != null ? layoutParams.columnSpec : layoutParams.rowSpec;
            interval = spec.span;
            boolean z2 = spec.startDefined;
            int clip = clip(interval, z2, i);
            int i5 = z2 ? interval.min : i2;
            if (i != 0) {
                if (!(z && z2)) {
                    while (!fits(iArr, i3, i5, i5 + clip)) {
                        if (z2) {
                            i3 += VERTICAL;
                        } else if (i5 + clip <= i) {
                            i5 += VERTICAL;
                        } else {
                            i3 += VERTICAL;
                            i5 = UNINITIALIZED_HASH;
                        }
                    }
                }
                procrusteanFill(iArr, i5, i5 + clip, i3 + size);
            }
            if (obj != null) {
                setCellGroup(layoutParams, i3, size, i5, clip);
            } else {
                setCellGroup(layoutParams, i5, clip, i3, size);
            }
            i2 = i5 + clip;
        }
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof LayoutParams)) {
            return DEFAULT_USE_DEFAULT_MARGINS;
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        checkLayoutParams(layoutParams2, DEFAULT_ORDER_PRESERVED);
        checkLayoutParams(layoutParams2, DEFAULT_USE_DEFAULT_MARGINS);
        return DEFAULT_ORDER_PRESERVED;
    }

    protected LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    protected LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    final Alignment getAlignment(Alignment alignment, boolean z) {
        return alignment != UNDEFINED_ALIGNMENT ? alignment : z ? START : BASELINE;
    }

    public int getAlignmentMode() {
        return this.mAlignmentMode;
    }

    public int getColumnCount() {
        return this.mHorizontalAxis.getCount();
    }

    final LayoutParams getLayoutParams(View view) {
        return (LayoutParams) view.getLayoutParams();
    }

    int getMargin1(View view, boolean z, boolean z2) {
        LayoutParams layoutParams = getLayoutParams(view);
        int i = z ? z2 ? layoutParams.leftMargin : layoutParams.rightMargin : z2 ? layoutParams.topMargin : layoutParams.bottomMargin;
        return i == UNDEFINED ? getDefaultMargin(view, layoutParams, z, z2) : i;
    }

    final int getMeasurementIncludingMargin(View view, boolean z) {
        return view.getVisibility() == 8 ? UNINITIALIZED_HASH : getMeasurement(view, z) + getTotalMargin(view, z);
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public Printer getPrinter() {
        return this.mPrinter;
    }

    public int getRowCount() {
        return this.mVerticalAxis.getCount();
    }

    public boolean getUseDefaultMargins() {
        return this.mUseDefaultMargins;
    }

    public boolean isColumnOrderPreserved() {
        return this.mHorizontalAxis.isOrderPreserved();
    }

    public boolean isRowOrderPreserved() {
        return this.mVerticalAxis.isOrderPreserved();
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        consistencyCheck();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        this.mHorizontalAxis.layout((i5 - paddingLeft) - paddingRight);
        this.mVerticalAxis.layout((i6 - paddingTop) - paddingBottom);
        int[] locations = this.mHorizontalAxis.getLocations();
        int[] locations2 = this.mVerticalAxis.getLocations();
        int childCount = getChildCount();
        for (int i7 = UNINITIALIZED_HASH; i7 < childCount; i7 += VERTICAL) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = getLayoutParams(childAt);
                Spec spec = layoutParams.columnSpec;
                Spec spec2 = layoutParams.rowSpec;
                Interval interval = spec.span;
                Interval interval2 = spec2.span;
                int i8 = locations[interval.min];
                int i9 = locations2[interval2.min];
                int i10 = locations[interval.max] - i8;
                int i11 = locations2[interval2.max] - i9;
                int measurement = getMeasurement(childAt, DEFAULT_ORDER_PRESERVED);
                int measurement2 = getMeasurement(childAt, DEFAULT_USE_DEFAULT_MARGINS);
                Alignment alignment = getAlignment(spec.alignment, (boolean) DEFAULT_ORDER_PRESERVED);
                Alignment alignment2 = getAlignment(spec2.alignment, (boolean) DEFAULT_USE_DEFAULT_MARGINS);
                Bounds bounds = (Bounds) this.mHorizontalAxis.getGroupBounds().getValue(i7);
                Bounds bounds2 = (Bounds) this.mVerticalAxis.getGroupBounds().getValue(i7);
                int gravityOffset = alignment.getGravityOffset(childAt, i10 - bounds.size(DEFAULT_ORDER_PRESERVED));
                int gravityOffset2 = alignment2.getGravityOffset(childAt, i11 - bounds2.size(DEFAULT_ORDER_PRESERVED));
                int margin = getMargin(childAt, DEFAULT_ORDER_PRESERVED, DEFAULT_ORDER_PRESERVED);
                int margin2 = getMargin(childAt, DEFAULT_USE_DEFAULT_MARGINS, DEFAULT_ORDER_PRESERVED);
                int margin3 = getMargin(childAt, DEFAULT_ORDER_PRESERVED, DEFAULT_USE_DEFAULT_MARGINS);
                int i12 = margin + margin3;
                int margin4 = margin2 + getMargin(childAt, DEFAULT_USE_DEFAULT_MARGINS, DEFAULT_USE_DEFAULT_MARGINS);
                i6 = bounds.getOffset(this, childAt, alignment, measurement + i12, DEFAULT_ORDER_PRESERVED);
                paddingBottom = bounds2.getOffset(this, childAt, alignment2, measurement2 + margin4, DEFAULT_USE_DEFAULT_MARGINS);
                int sizeInCell = alignment.getSizeInCell(childAt, measurement, i10 - i12);
                int sizeInCell2 = alignment2.getSizeInCell(childAt, measurement2, i11 - margin4);
                i6 += i8 + gravityOffset;
                i6 = !isLayoutRtlCompat() ? i6 + (paddingLeft + margin) : (((i5 - sizeInCell) - paddingRight) - margin3) - i6;
                paddingBottom = (paddingBottom + ((paddingTop + i9) + gravityOffset2)) + margin2;
                if (!(sizeInCell == childAt.getMeasuredWidth() && sizeInCell2 == childAt.getMeasuredHeight())) {
                    childAt.measure(MeasureSpec.makeMeasureSpec(sizeInCell, 1073741824), MeasureSpec.makeMeasureSpec(sizeInCell2, 1073741824));
                }
                childAt.layout(i6, paddingBottom, sizeInCell + i6, sizeInCell2 + paddingBottom);
            }
        }
    }

    protected void onMeasure(int i, int i2) {
        int measure;
        int measure2;
        consistencyCheck();
        invalidateValues();
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int adjust = adjust(i, -paddingLeft);
        int adjust2 = adjust(i2, -paddingTop);
        measureChildrenWithMargins(adjust, adjust2, DEFAULT_ORDER_PRESERVED);
        if (this.mOrientation == 0) {
            measure = this.mHorizontalAxis.getMeasure(adjust);
            measureChildrenWithMargins(adjust, adjust2, DEFAULT_USE_DEFAULT_MARGINS);
            measure2 = this.mVerticalAxis.getMeasure(adjust2);
        } else {
            measure2 = this.mVerticalAxis.getMeasure(adjust2);
            measureChildrenWithMargins(adjust, adjust2, DEFAULT_USE_DEFAULT_MARGINS);
            measure = this.mHorizontalAxis.getMeasure(adjust);
        }
        setMeasuredDimension(an.m362a(Math.max(measure + paddingLeft, getSuggestedMinimumWidth()), i), an.m362a(Math.max(measure2 + paddingTop, getSuggestedMinimumHeight()), i2));
    }

    public void requestLayout() {
        super.requestLayout();
        invalidateStructure();
    }

    public void setAlignmentMode(int i) {
        this.mAlignmentMode = i;
        requestLayout();
    }

    public void setColumnCount(int i) {
        this.mHorizontalAxis.setCount(i);
        invalidateStructure();
        requestLayout();
    }

    public void setColumnOrderPreserved(boolean z) {
        this.mHorizontalAxis.setOrderPreserved(z);
        invalidateStructure();
        requestLayout();
    }

    public void setOrientation(int i) {
        if (this.mOrientation != i) {
            this.mOrientation = i;
            invalidateStructure();
            requestLayout();
        }
    }

    public void setPrinter(Printer printer) {
        if (printer == null) {
            printer = NO_PRINTER;
        }
        this.mPrinter = printer;
    }

    public void setRowCount(int i) {
        this.mVerticalAxis.setCount(i);
        invalidateStructure();
        requestLayout();
    }

    public void setRowOrderPreserved(boolean z) {
        this.mVerticalAxis.setOrderPreserved(z);
        invalidateStructure();
        requestLayout();
    }

    public void setUseDefaultMargins(boolean z) {
        this.mUseDefaultMargins = z;
        requestLayout();
    }
}
