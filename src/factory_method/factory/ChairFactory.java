package factory_method.factory;

import factory_method.product.Chair;

public interface ChairFactory {

    default Chair manufactureChair() {

        Chair chair = createChair();

        chair.checkQuality();

        return chair;
    }

    Chair createChair();
}
