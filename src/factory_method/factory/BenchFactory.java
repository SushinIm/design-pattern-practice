package factory_method.factory;

import abstract_factory.FactoryConfiguration;
import factory_method.product.Bench;

public class BenchFactory implements ChairFactory {
    private BenchFactory() {}

    private static class BenchFactoryInstanceHolder {
        private static final BenchFactory INSTANCE = new BenchFactory();
    }

    public static BenchFactory getInstance() {
        return BenchFactory.BenchFactoryInstanceHolder.INSTANCE;
    }

    @Override
    public Bench createChair() {
        return new Bench();
    }
}
