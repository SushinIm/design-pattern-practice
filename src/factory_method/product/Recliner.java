package factory_method.product;

public class Recliner extends Chair {

    @Override
    public void checkQuality() {
        System.out.println("리클라이너의 품질검증 수행 로직");
    }
}
