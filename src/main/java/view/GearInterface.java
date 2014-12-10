//package view;
//
//import model.Door;
//import model.Plane;
//
//import javax.swing.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//
///**
// * Plane's interface.
// */
//public class GearInterface {
//
//    private JPanel panel1;
//    private JRadioButton REDRadioButton;
//    private JRadioButton ORANGERadioButton;
//    private JRadioButton GREENRadioButton;
//    private JRadioButton UPRadioButton;
//    private JRadioButton DOWNRadioButton;
//    private JRadioButton MOVINGRadioButton;
//    private JButton upButton;
//    private JButton downButton;
//    private DoorPanel doorPanelTest;
//
//    public Plane plane = new Plane();
//    public static Door door = new Door();
//
//    public static final int SLEEPTIME_1 = 2000;
//    public static final int SLEEPTIME_2 = 2000;
//
//
//    public GearInterface() {
//
//
//
//        upButton.addActionListener(new ActionListener() {
//
//            @Override
//            public void actionPerformed(ActionEvent e) {
//
////                plane.handle.pushUp();     // correct the model handle position
////                plane.doors[1].open();
////                process();
//                doorPanelTest.door.open();
//
//            }
//        });
//
//        downButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//
////                plane.handle.pushDown();    // correct the model handle position
////                plane.doors[1].close();
////                process();
//                doorPanelTest.door.close();
//            }
//        });
//    }
////
////    public static void main(String[] args) {
////
////
////
////        JFrame frame = new JFrame("Interface");
////        frame.setContentPane(new GearInterface().panel1);
////        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
////        frame.pack();
////        frame.setVisible(true);
////
////
////    }
//
////    private void createUIComponents() {
////    }
//
//
//    //
//    // PUBLIC HELPERS
//    //
//    /**
//     * Update the plane according to the plane current state.
//     */
//    public void updateView() {
//
//        // update the light
//
//        // turn off all lights
//        turnOffLights();
//
//        if (plane.doors[1].isOpen())
//            setButtonState(UPRadioButton, true);
//        else if (plane.doors[1].isMoving())
//            setButtonState(MOVINGRadioButton, true);
//        else if (plane.doors[1].isClosed())
//            setButtonState(DOWNRadioButton, true);
//
////        // turn on the proper light
////        switch (plane.lights.color) {
////
////            case GREEN:
////                setButtonState(GREENRadioButton, true);
////                break;
////
////            case ORANGE:
////                setButtonState(ORANGERadioButton, true);
////                break;
////
////            case RED:
////                setButtonState(REDRadioButton, true);
////                break;
////
////            default:
////                // case OFF
////                // nothing to do since all lights are already turned off
////        }
////
////
////        // update the wheels
////
////        // turn off all lights
////        turnOffWheelsLights();
//
//        // turn on the proper light
//        //TODO
////        switch (plane.wheels.position) {
////
////            case RETRACTED:
////                setButtonState(UPRadioButton, true);
////                break;
////
////            case DEPLOYED:
////                setButtonState(DOWNRadioButton, true);
////                break;
////
////            case MOVING:
////                setButtonState(MOVINGRadioButton, true);
////                break;
////
////            default:
////                setButtonState(UPRadioButton, true);
////        }
//    }
//
//
//    //
//    // PRIVATE HELPERS
//    //
//    /**
//     * Helper to turn off all lights
//     */
//    private void turnOffLights() {
//
//        JRadioButton[] lightsButton = {GREENRadioButton, ORANGERadioButton, REDRadioButton};
//
//        for (JRadioButton lightButton: lightsButton) {
//            setButtonState(lightButton, false);
//        }
//    }
//
//    /**
//     * Helper to turn on or off a given button.<br />
//     * <br />
//     * A turned on button is enabled and selected.<br />
//     * A turn off button is disabled and unselected.
//     *
//     * @param lightButton
//     * @param enabled Turn the light on if is true, off otherwise.
//     */
//    private void setButtonState(JRadioButton lightButton, boolean enabled) {
//
//        lightButton.setEnabled(enabled);
//        lightButton.setSelected(enabled);
//    }
//
//    /**
//     * Turn off all the lights of the wheels.
//     */
//    private void turnOffWheelsLights() {
//
//        JRadioButton[] wheelsLight = {UPRadioButton, MOVINGRadioButton, DOWNRadioButton};
//
//        for (JRadioButton wheelLightButton: wheelsLight) {
//            setButtonState(wheelLightButton, false);
//        }
//    }
//
//    /**
//     * Process the plane software and update the plane.view accordingly. Timers are used to simulate the time taking by the
//     * plane processing.
//     */
//    private void process() {
//
//        // wait a moment before taking action
//        Timer timer1 = new Timer(SLEEPTIME_1, new HandleProcessingActionListener()),
//              timer2 = new Timer(SLEEPTIME_1 + SLEEPTIME_2, new HandleProcessingActionListener());
//
//        timer1.setRepeats(false);
//        timer1.start();
//
//        timer2.setRepeats(false);
//        timer2.start();
//    }
//
//    private void createUIComponents() {
//    }
//
//    /**
//     * ActionListener that process the plane software and update the plane.view.
//     */
//    private class HandleProcessingActionListener implements ActionListener {
//
//        @Override
//        public void actionPerformed(ActionEvent arg0) {
//
//
//
//            plane.process();            // process the plane software
//            updateView();               // update the plane
//        }
//    }
//
//
//}