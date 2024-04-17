package abstract_factory;

import abstract_factory.factory.FurnitureFactory;
import abstract_factory.factory.PlasticFactory;
import abstract_factory.factory.WoodFactory;
import constant.Material;

public class FactoryConfiguration {
    private FactoryConfiguration() {}

    private static class FactoryConfigurationInstanceHolder {
        private static final FactoryConfiguration INSTANCE = new FactoryConfiguration();
    }

    public static FactoryConfiguration getInstance() {
        return FactoryConfiguration.FactoryConfigurationInstanceHolder.INSTANCE;
    }

    public FurnitureFactory configureFactory(Material material) {
        return switch(material) {
            case WOOD -> WoodFactory.getInstance();
            case PLASTIC -> PlasticFactory.getInstance();
        };
    }
}
