//import javax.swing.*;
//import java.awt.*;
//
//public class TreasureGameView extends JFrame {
//    // has-a TreasureGame
//    private TreasureGame treasureGame;
//    //has-a triesLeftField
//    private JTextField triesLeftField;
//    //has-a treasures left field
//    private JTextField treasuresLeftField;
//    private JTextField lastMoveField;
//
//    public TreasureGameView(TreasureGame newTreasureGame) {
//        treasureGame = newTreasureGame;
//        setTitle("Treasure Hunt");
//        setSize(800, 500);
//        setLayout(new BorderLayout());
//
//        JPanel gridPanel = new JPanel();
//        gridPanel.setLayout(new GridLayout(10, 10));
//        add(gridPanel, BorderLayout.CENTER);
//
//
//        for (int counter = 0; counter < treasureGame.getNumberStillHidden(); counter++) {
//
//            gridPanel.add(new TreasureButton(treasureGame, this));
//
//        }
//        for (int counter = 0; counter < (10 * 10) - treasureGame.getNumberStillHidden(); counter++) {
//
//            gridPanel.add(new EmptyButton(treasureGame, this));
//        }
//
//
//        JPanel triesLeftPanel = new JPanel();
//
//        JLabel triesLeftLabel = new JLabel("Tries left:");
//        triesLeftPanel.add(triesLeftLabel);
//        triesLeftField = new JTextField("" + treasureGame.getNumberOfTriesLeft());
//        triesLeftPanel.add(triesLeftField);
//        JLabel treasuresLeftLabel = new JLabel("Treasures left:");
//        triesLeftPanel.add(treasuresLeftLabel);
//        treasuresLeftField = new JTextField("" + treasureGame.getNumberStillHidden());
//        triesLeftPanel.add(treasuresLeftField);
//
//
//        add(triesLeftPanel, BorderLayout.WEST);
//
//        JPanel lastMovePanel = new JPanel();
//        JLabel lastMoveLabel = new JLabel("Your last move was: ");
//        lastMovePanel.add(lastMoveLabel);
//        lastMoveField = new JTextField("");
//        lastMovePanel.add(lastMoveField);
//        add(lastMovePanel, BorderLayout.SOUTH);
//
//
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setVisible(true);
//    }
//
//    //Purpose; Update Value of triesLeftField
//    public void updateUI() {
//        triesLeftField.setText("" + treasureGame.getNumberOfTriesLeft());
//        treasuresLeftField.setText("" + treasureGame.getNumberStillHidden());
//    }
//}
