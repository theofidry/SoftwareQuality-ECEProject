package view;

import junit.framework.TestCase;
import model.Plane;
import org.junit.BeforeClass;
import org.junit.Test;

import javax.swing.JSlider;

/**
 * Tests for {@link view.HandlePanelTest}
 */
public class HandlePanelTest extends TestCase {

    private Plane plane;
    private HandlePanel handlePanel;
    private JSlider slider;

    @BeforeClass
    public void setUp() throws Exception {

        plane = new Plane();
        handlePanel = new HandlePanel(plane.getHandle(), plane.getSoftware());
        slider = (JSlider) handlePanel.getComponent(1);
    }


    @Test
    public void testSliderValuesLimits() throws Exception {

        slider.setValue(3);
        assertTrue(slider.getValue() == 1);

        slider.setValue(-1);
        assertTrue(slider.getValue() == 0);
    }

    @Test
    public void testModelToViewBinding() throws Exception {

        plane.getHandle().pushUp();
        assertTrue(slider.getValue() == 1);

        plane.getHandle().pushDown();
        assertTrue(slider.getValue() == 0);

        plane.getHandle().pushUp();
        assertTrue(slider.getValue() == 1);
    }

    @Test
    public void testViewToModelBinding() throws Exception {

        slider.setValue(0);
        assertFalse(plane.getHandle().isUp());

        slider.setValue(1);
        assertTrue(plane.getHandle().isUp());

        slider.setValue(0);
        assertFalse(plane.getHandle().isUp());
    }
}