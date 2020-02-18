import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
class Prom extends JFrame{
    private ArrayList<Student> students = new ArrayList<>(0);
    private ArrayList<Table> tables = new ArrayList<>(0);
   // private TicketingSystem menu = new TicketingSystem(students, tables);
    private FloorPlanSystem floorPlanSystem = new FloorPlanSystem(tables);
    private final int MAX_X = 800;
    private final int MAX_Y = 600;
    
     Prom(){
        FloorPlanSystem panel = new FloorPlanSystem(tables);
        this.getContentPane().add(BorderLayout.CENTER, panel);
        this.addMouseListener(new MyMouseListener());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(MAX_X, MAX_Y);
        this.setVisible(true);
        /*
        //Sets to fullscreen
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setUndecorated(true);
        */
    }

    private static class MyMouseListener implements MouseListener {
        @Override
        public void mouseClicked(MouseEvent mouseEvent) {
        }
        @Override
        public void mouseEntered(MouseEvent mouseEvent) {
        }
        @Override
        public void mouseExited(MouseEvent mouseEvent) {
        }
        @Override
        public void mousePressed(MouseEvent mouseEvent) {
        }
        @Override
        public void mouseReleased(MouseEvent mouseEvent) {
        }
    }
}
   