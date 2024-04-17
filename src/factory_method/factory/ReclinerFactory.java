package factory_method.factory;

import factory_method.product.Recliner;

public class ReclinerFactory implements ChairFactory {
    private ReclinerFactory() {}

    private static class ReclinerFactoryInstanceHolder {
        private static final ReclinerFactory INSTANCE = new ReclinerFactory();
    }

    public static ReclinerFactory getInstance() {
        return ReclinerFactory.ReclinerFactoryInstanceHolder.INSTANCE;
    }

    @Override
    public Recliner createChair() {
        return new Recliner();
    }
}
