package abstract_factory.factory;

import abstract_factory.product.Chair;
import abstract_factory.product.Table;

public interface FurnitureFactory {
    Chair createChair();
    Table createTable();
}
