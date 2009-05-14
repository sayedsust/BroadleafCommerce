package org.broadleafcommerce.order.service.type;

public enum OrderItemType {

    DISCRETE ("org.broadleafcommerce.order.domain.DiscreteOrderItem"),
    BUNDLE("org.broadleafcommerce.order.domain.BundleOrderItem"),
    GIFTWRAP("org.broadleafcommerce.order.domain.GiftWrapOrderItem");

    private final String className;

    OrderItemType(String className) {
        this.className = className;
    }

    public String getClassName() {
        return className;
    }

}