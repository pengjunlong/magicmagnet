package org.apache.xerces.util;

import java.util.Enumeration;
import java.util.HashMap;
import org.apache.xerces.xni.Augmentations;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class AugmentationsImpl implements Augmentations {
    private AugmentationsItemsContainer fAugmentationsContainer;

    static abstract class AugmentationsItemsContainer {
        AugmentationsItemsContainer() {
        }

        public abstract void clear();

        public abstract AugmentationsItemsContainer expand();

        public abstract Object getItem(Object obj);

        public abstract boolean isFull();

        public abstract Enumeration keys();

        public abstract Object putItem(Object obj, Object obj2);

        public abstract Object removeItem(Object obj);
    }

    static final class LargeContainer extends AugmentationsItemsContainer {
        private final HashMap fAugmentations;

        LargeContainer() {
        }

        @Override // org.apache.xerces.util.AugmentationsImpl.AugmentationsItemsContainer
        public void clear() {
        }

        @Override // org.apache.xerces.util.AugmentationsImpl.AugmentationsItemsContainer
        public AugmentationsItemsContainer expand() {
        }

        @Override // org.apache.xerces.util.AugmentationsImpl.AugmentationsItemsContainer
        public Object getItem(Object obj) {
        }

        @Override // org.apache.xerces.util.AugmentationsImpl.AugmentationsItemsContainer
        public boolean isFull() {
        }

        @Override // org.apache.xerces.util.AugmentationsImpl.AugmentationsItemsContainer
        public Enumeration keys() {
        }

        @Override // org.apache.xerces.util.AugmentationsImpl.AugmentationsItemsContainer
        public Object putItem(Object obj, Object obj2) {
        }

        @Override // org.apache.xerces.util.AugmentationsImpl.AugmentationsItemsContainer
        public Object removeItem(Object obj) {
        }

        public String toString() {
        }
    }

    static final class SmallContainer extends AugmentationsItemsContainer {
        static final int SIZE_LIMIT = 10;
        final Object[] fAugmentations;
        int fNumEntries;

        final class SmallContainerKeyEnumeration implements Enumeration {
            Object[] enumArray;
            int next;
            final /* synthetic */ SmallContainer this$0;

            SmallContainerKeyEnumeration(SmallContainer smallContainer) {
            }

            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
            }

            @Override // java.util.Enumeration
            public Object nextElement() {
            }
        }

        SmallContainer() {
        }

        @Override // org.apache.xerces.util.AugmentationsImpl.AugmentationsItemsContainer
        public void clear() {
        }

        @Override // org.apache.xerces.util.AugmentationsImpl.AugmentationsItemsContainer
        public AugmentationsItemsContainer expand() {
        }

        @Override // org.apache.xerces.util.AugmentationsImpl.AugmentationsItemsContainer
        public Object getItem(Object obj) {
        }

        @Override // org.apache.xerces.util.AugmentationsImpl.AugmentationsItemsContainer
        public boolean isFull() {
        }

        @Override // org.apache.xerces.util.AugmentationsImpl.AugmentationsItemsContainer
        public Enumeration keys() {
        }

        @Override // org.apache.xerces.util.AugmentationsImpl.AugmentationsItemsContainer
        public Object putItem(Object obj, Object obj2) {
        }

        @Override // org.apache.xerces.util.AugmentationsImpl.AugmentationsItemsContainer
        public Object removeItem(Object obj) {
        }

        public String toString() {
        }
    }

    @Override // org.apache.xerces.xni.Augmentations
    public Object getItem(String str) {
    }

    @Override // org.apache.xerces.xni.Augmentations
    public Enumeration keys() {
    }

    @Override // org.apache.xerces.xni.Augmentations
    public Object putItem(String str, Object obj) {
    }

    @Override // org.apache.xerces.xni.Augmentations
    public void removeAllItems() {
    }

    @Override // org.apache.xerces.xni.Augmentations
    public Object removeItem(String str) {
    }

    public String toString() {
    }
}
