import abstract_factory.FactoryConfiguration;
import abstract_factory.factory.FurnitureFactory;
import abstract_factory.product.Chair;
import abstract_factory.product.Table;
import builder.builder.DesktopBuilder;
import builder.model.Desktop;
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
            case "3" -> {
                Desktop desktop = new DesktopBuilder()
                        .computerCase("케이스")
                        .cpu("cpu")
                        .ram("ram")
                        .mainBoard("메인보드")
                        .storage("저장소")
                        .graphic("그래픽카드")
                        .odd("cd 플레이어")
                        .cooler("쿨러")
                        .build();

                System.out.println(desktop);
            }
        }
    }
}
