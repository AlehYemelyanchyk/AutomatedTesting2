package by.epam.ayem.javacleancode.aircompany.java;

import by.epam.ayem.javacleancode.aircompany.java.planes.ExperimentalPlane;
import by.epam.ayem.javacleancode.aircompany.java.planes.MilitaryPlane;
import by.epam.ayem.javacleancode.aircompany.java.planes.PassengerPlane;
import by.epam.ayem.javacleancode.aircompany.java.planes.Plane;
import by.epam.ayem.javacleancode.aircompany.java.models.ExperimentalTypes;
import by.epam.ayem.javacleancode.aircompany.java.models.MilitaryType;
import by.epam.ayem.javacleancode.aircompany.java.models.ClassificationLevel;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class AirportTest {

    private PassengerPlane planeWithMaxPassengerCapacity = new PassengerPlane(
            "Boeing-747", 980, 16100, 70500, 242);
    private MilitaryPlane transportMilitaryPlane = new MilitaryPlane(
            "C-130 Hercules", 650, 5000, 110000, MilitaryType.TRANSPORT);

    private List<Plane> planes = Arrays.asList(
            new PassengerPlane("Boeing-737", 900, 12000, 60500, 164),
            new PassengerPlane("Boeing-737-800", 940, 12300, 63870, 192),
            new PassengerPlane("Boeing-747", 980, 16100, 70500, 242),
            new PassengerPlane("Airbus A320", 930, 11800, 65500, 188),
            new PassengerPlane("Airbus A330", 990, 14800, 80500, 222),
            new PassengerPlane("Embraer 190", 870, 8100, 30800, 64),
            new PassengerPlane("Sukhoi Superjet 100", 870, 11500, 50500, 140),
            new PassengerPlane("Bombardier CS300", 920, 11000, 60700, 196),
            new MilitaryPlane("B-1B Lancer", 1050, 21000, 80000, MilitaryType.BOMBER),
            new MilitaryPlane("B-2 Spirit", 1030, 22000, 70000, MilitaryType.BOMBER),
            new MilitaryPlane("B-52 Stratofortress", 1000, 20000, 80000, MilitaryType.BOMBER),
            new MilitaryPlane("F-15", 1500, 12000, 10000, MilitaryType.FIGHTER),
            new MilitaryPlane("F-22", 1550, 13000, 11000, MilitaryType.FIGHTER),
            transportMilitaryPlane,
            new ExperimentalPlane("Bell X-14", 277, 482, 500,
                    ExperimentalTypes.HIGH_ALTITUDE, ClassificationLevel.SECRET),
            new ExperimentalPlane("Ryan X-13 Vertijet", 560, 307, 500,
                    ExperimentalTypes.VTOL, ClassificationLevel.TOP_SECRET)
    );

    private Airport airport = new Airport(planes);

    @Test
    public void testGetTransportMilitaryPlanes() {
        int expected = 1;
        List<MilitaryPlane> transportMilitaryPlanes = airport.getTransportMilitaryPlanes();
        Assert.assertNotNull(transportMilitaryPlanes);
        Assert.assertEquals(expected, transportMilitaryPlanes.size());
        Assert.assertEquals(transportMilitaryPlane, transportMilitaryPlanes.get(0));
    }

    @Test
    public void testGetPassengerPlaneWithMaxPassengerCapacityFiltering() {
        PassengerPlane actual = airport.getPassengerPlaneWithMaxPassengersCapacity();
        Assert.assertNotNull(actual);
        Assert.assertEquals(planeWithMaxPassengerCapacity, actual);
    }

    @Test
    public void sortByMaxLoadCapacityTest() {
        airport.sortByMaxLoadCapacity();
        List<? extends Plane> planesSortedByMaxLoadCapacity = airport.getPlanes();

        Assert.assertNotNull(planesSortedByMaxLoadCapacity);

        boolean nextPlaneMaxLoadCapacityIsHigherThanCurrent = true;
        for (int i = 0; i < planesSortedByMaxLoadCapacity.size() - 1; i++) {
            Plane currentPlane = planesSortedByMaxLoadCapacity.get(i);
            Plane nextPlane = planesSortedByMaxLoadCapacity.get(i + 1);
            if (currentPlane.getMaxLoadCapacity() > nextPlane.getMaxLoadCapacity()) {
                nextPlaneMaxLoadCapacityIsHigherThanCurrent = false;
                break;
            }
        }
        Assert.assertTrue(nextPlaneMaxLoadCapacityIsHigherThanCurrent);
    }

    @Test
    public void hasAtLeastOneBomberInMilitaryPlanesTest() {
        List<MilitaryPlane> bomberMilitaryPlanes = airport.getBomberMilitaryPlanes();

        Assert.assertNotNull(bomberMilitaryPlanes);

        boolean hasAtLeastOneBomberInMilitaryPlanes = false;
        for (MilitaryPlane militaryPlane : bomberMilitaryPlanes) {
            if ((militaryPlane.getMilitaryType() == MilitaryType.BOMBER)) {
                hasAtLeastOneBomberInMilitaryPlanes = true;
                break;
            }
        }
        Assert.assertTrue(hasAtLeastOneBomberInMilitaryPlanes);
    }

    @Test
    public void hasExperimentalPlanesUnclassifiedLevelPlanesTest() {
        List<ExperimentalPlane> experimentalPlanes = airport.getExperimentalPlanes();

        Assert.assertNotNull(experimentalPlanes);

        boolean hasUnclassifiedPlanes = false;
        for (ExperimentalPlane experimentalPlane : experimentalPlanes) {
            if (experimentalPlane.getClassificationLevel() == ClassificationLevel.UNCLASSIFIED) {
                hasUnclassifiedPlanes = true;
                break;
            }
        }
        Assert.assertFalse(hasUnclassifiedPlanes);
    }
}
