package abstract_factory.factory;

import abstract_factory.product.Chair;
import abstract_factory.product.Table;
import abstract_factory.product.WoodChair;
import abstract_factory.product.WoodTable;

public class WoodFactory implements FurnitureFactory {

    @Override
    public Chair createChair() {
        return new WoodChair();
    }

    @Override
    public Table createTable() {
        return new WoodTable();
    }
}
