package fuel.domain;

class Sonata extends Car {
    private static final int FUEL_EFFICIENCY_VALUE = 10;
    private final int distance;


    Sonata(final int distance) {
        this.distance = distance;
    }

    @Override
    int getDistancePerLitter() {
        return FUEL_EFFICIENCY_VALUE;
    }

    @Override
    int getDistance() {
        return this.distance;
    }

    @Override
    String getName() {
        return "Sonata";
    }

}
