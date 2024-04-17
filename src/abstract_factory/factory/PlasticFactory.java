package abstract_factory.factory;

import abstract_factory.product.Chair;
import abstract_factory.product.PlasticChair;
import abstract_factory.product.PlasticTable;
import abstract_factory.product.Table;

public class PlasticFactory implements FurnitureFactory {
    private PlasticFactory() {}

    private static class PlasticFactoryInstanceHolder {
        private static final PlasticFactory INSTANCE = new PlasticFactory();
    }

    public static PlasticFactory getInstance() {
        return PlasticFactory.PlasticFactoryInstanceHolder.INSTANCE;
    }

    @Override
    public Chair createChair() {
        return new PlasticChair();
    }

    @Override
    public Table createTable() {
        return new PlasticTable();
    }
}
