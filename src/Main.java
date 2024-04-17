import abstract_factory.FactoryConfiguration;
import abstract_factory.factory.FurnitureFactory;
import abstract_factory.product.Chair;
import abstract_factory.product.Table;
import constant.Material;
import factory_method.factory.BenchFactory;
import factory_method.factory.ReclinerFactory;

public class Main {

    public static void main(String[] args) {
        switch (args[0]) {
            case "1" -> {
                FactoryConfiguration factoryConfiguration = FactoryConfiguration.getInstance();

                FurnitureFactory factory = factoryConfiguration.configureFactory(Material.WOOD);
                Chair chair = factory.createChair();
                Table table = factory.createTable();

                chair.selfIntroduce();
                table.selfIntroduce();
            }
            case "2" -> {
                factory_method.product.Chair bench = BenchFactory.getInstance().manufactureChair();
                factory_method.product.Chair recliner = ReclinerFactory.getInstance().manufactureChair();
            }
        }
    }
}
