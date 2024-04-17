package abstract_factory.factory;

import abstract_factory.product.Chair;
import abstract_factory.product.Table;
import abstract_factory.product.WoodChair;
import abstract_factory.product.WoodTable;

public class WoodFactory implements FurnitureFactory {
    private WoodFactory() {}

    private static class WoodFactoryInstanceHolder {
        private static final WoodFactory INSTANCE = new WoodFactory();
    }

    public static WoodFactory getInstance() {
        return WoodFactory.WoodFactoryInstanceHolder.INSTANCE;
    }

    @Override
    public Chair createChair() {
        return new WoodChair();
    }

    @Override
    public Table createTable() {
        return new WoodTable();
    }
}
