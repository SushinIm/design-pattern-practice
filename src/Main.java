import abstract_factory.FactoryConfiguration;
import abstract_factory.factory.FurnitureFactory;
import abstract_factory.product.Chair;
import abstract_factory.product.Table;
import constant.Material;

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

            }
        }
    }
}
