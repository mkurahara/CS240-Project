/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workoutapp;

/**
 *
 * @author Montana Kurahara
 */
import java.io.File;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class WorkOutApp extends javax.swing.JFrame {
/** 
 * This class tests the ability of the ExerciseReader class to use 
 * the Exercise class, and an input file named "workoutfile.txt" 
 * which holds a list of exercises, their descriptions, type of exercise, and difficulty of the exercise. 
 * When the main method is run, it will compile all the exercises and separate them 
 * into different ArrayLists based off of what type of exercise it is (Leg,Arm,Core).
 */
    public Routine legs1;
    public Routine legs2;
    public Routine legs3;
    public Routine core1;
    public Routine core2;
    public Routine core3;
    public Routine arms1;
    public Routine arms2;
    public Routine arms3;
    private javax.swing.JButton jButton1 = new JButton();
    
    public WorkOutApp() {
        initBuild();
        initComponents();
    }
    
    private void initBuild(){
        //Scanner user = new Scanner(System.in);
        //System.out.println("Input file name: ");
        //inputFile = user.nextLine().trim();
        String inputFile = "src/workoutapp/workoutfile.abc";
        File filename = new File(inputFile);
        ExerciseReader ex = new ExerciseReader(filename);
        TypeCreator type = new TypeCreator(ex.getList());
        type.createTypeLists();
        ArrayList<Exercise> legEx = type.getList(1);
        ArrayList<Exercise> coreEx = type.getList(2);
        ArrayList<Exercise> armEx = type.getList(3);
        //System.out.println("Leg Exercises: " + legEx + "\nCore Exercises: " + coreEx + "\nArm Exercises: " + armEx);
        DifficultySeparator legs = new DifficultySeparator(legEx);
        legs1 = new Routine(legs.getList("difficulty1"));
        legs2 = new Routine(legs.getList("difficulty2"));
        legs3 = new Routine(legs.getList("difficulty3"));
        DifficultySeparator core = new DifficultySeparator(coreEx);
        core1 = new Routine(core.getList("difficulty1"));
        core2 = new Routine(core.getList("difficulty2"));
        core3 = new Routine(core.getList("difficulty3"));
        DifficultySeparator arms = new DifficultySeparator(armEx);
        arms1 = new Routine(arms.getList("difficulty1"));
        arms2 = new Routine(arms.getList("difficulty2"));
        arms3 = new Routine(arms.getList("difficulty3"));
        System.out.println("LEGS SPLIT BY DIFFICULTY: \nDifficulty 1: " + legs.getList("difficulty1") + "\nDifficulty 2: " + legs.getList("difficulty2") + "\nDifficulty 3: " + legs.getList("difficulty3"));
        System.out.println("CORE SPLIT BY DIFFICULTY: \nDifficulty 1: " + core.getList("difficulty1") + "\nDIfficulty 2: " + core.getList("difficulty2") + "\nDifficulty 3: " + core.getList("difficulty3"));
        System.out.println("ARMS SPLIT BY DIFFICULTY: \nDifficulty 1: " + arms.getList("difficulty1") + "\nDifficulty 2: " + arms.getList("difficulty2") + "\nDifficulty 3: " + arms.getList("difficulty3"));
        System.out.println("Done.");
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }   
    private void initComponents(){
        
        int userDifficulty = 2; //userInfo.getDifficulty(); //Need to implement
        int focusArea = 3; //userInfo.getFocus();
        Routine rout;
        if (userDifficulty == 1 && focusArea == 1){
            rout = legs1;
        } else if (userDifficulty == 2 && focusArea == 1){
            rout = legs2;
        } else if (userDifficulty == 3 && focusArea == 1){
            rout = legs3;
        } else if (userDifficulty == 1 && focusArea == 2){
            rout = core1;
        } else if (userDifficulty == 2 && focusArea == 2){
            rout = core2;
        } else if (userDifficulty == 3 && focusArea == 2){
            rout = core3;
        } else if (userDifficulty == 1 && focusArea == 3){
            rout = arms1;
        } else if (userDifficulty == 2 && focusArea == 3){
            rout = arms2;
        } else {
            rout = arms3;
        }
        String[] str = {"Exercise", "Description", "Sets and Reps", "Weight"};
        DefaultTableModel tableModel = new DefaultTableModel(str, 0);
        ArrayList<Exercise> routList = rout.getRoutine();
        for (int i=0; i<routList.size(); i++){
            String exer = routList.get(i).getName();
            String desc = routList.get(i).getDescription();
            String sar = routList.get(i).getSetsAndReps();
            String weight = "" + routList.get(i).getWeight();
            String[] str1 = {exer,desc,sar,weight};
            tableModel.addRow(str1);
        }
        JScrollPane jScrollPane1 = new javax.swing.JScrollPane();
        JTable table = new JTable(tableModel);
        table.setModel(tableModel);
        jScrollPane1.setViewportView(table);
        
        jButton1.setText("Done");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(150, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(150, 150, 150))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>         
    
    public static void main(String[] args){
           
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WorkOutApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new WorkOutApp().setVisible(true);
        });
    }

}

    

