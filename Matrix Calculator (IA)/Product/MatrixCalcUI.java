
public class MatrixCalcUI extends javax.swing.JFrame {

    /**
     * Creates new form MatrixCalcUI
     */
    public MatrixCalcUI() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        A00 = new javax.swing.JTextField();
        A10 = new javax.swing.JTextField();
        A02 = new javax.swing.JTextField();
        A01 = new javax.swing.JTextField();
        A11 = new javax.swing.JTextField();
        A12 = new javax.swing.JTextField();
        A20 = new javax.swing.JTextField();
        A21 = new javax.swing.JTextField();
        A22 = new javax.swing.JTextField();
        B00 = new javax.swing.JTextField();
        B01 = new javax.swing.JTextField();
        B02 = new javax.swing.JTextField();
        B10 = new javax.swing.JTextField();
        B11 = new javax.swing.JTextField();
        B12 = new javax.swing.JTextField();
        B20 = new javax.swing.JTextField();
        B21 = new javax.swing.JTextField();
        B22 = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        C00 = new javax.swing.JTextField();
        C02 = new javax.swing.JTextField();
        C01 = new javax.swing.JTextField();
        C11 = new javax.swing.JTextField();
        C12 = new javax.swing.JTextField();
        C10 = new javax.swing.JTextField();
        C20 = new javax.swing.JTextField();
        C21 = new javax.swing.JTextField();
        C22 = new javax.swing.JTextField();
        exitButton = new javax.swing.JButton();
        detButton = new javax.swing.JButton();
        detOutput = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        invButton = new javax.swing.JButton();
        multButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Matrix Calculator");

        jLabel2.setText("Matrix A");

        jLabel3.setText("Matrix B");

        jLabel4.setText("Matrix C (answer)");

        // setting these to 0 makes it so text boxes arent empty so there is less chance for error, there isnt really any other easy fix
        A00.setText("0");

        A10.setText("0");

        A02.setText("0");

        A01.setText("0");

        A11.setText("0");

        A12.setText("0");

        A20.setText("0");

        A21.setText("0");

        A22.setText("0");

        B00.setText("0");

        B01.setText("0");

        B02.setText("0");

        B10.setText("0");

        B11.setText("0");

        B12.setText("0");

        B20.setText("0");

        B21.setText("0");

        B22.setText("0");

        addButton.setText("A + B = C");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        C00.setEditable(false);

        C02.setEditable(false);

        C01.setEditable(false);

        C11.setEditable(false);

        C12.setEditable(false);

        C10.setEditable(false);

        C20.setEditable(false);

        C21.setEditable(false);

        C22.setEditable(false);

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        detButton.setText("det(A)");
        detButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detButtonActionPerformed(evt);
            }
        });

        detOutput.setEditable(false);
        

        jLabel5.setText("Determinant:");

        invButton.setText("(A^-1) = C");
        invButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invButtonActionPerformed(evt);
            }
        });

        multButton.setText("A * B = C");
        multButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(151, 151, 151)
                .addComponent(jLabel4)
                .addGap(53, 53, 53))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(A10, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(A11, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(A12, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(A00, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(178, 178, 178)
                                        .addComponent(jLabel1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(exitButton)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(B10, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(A01, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(A02, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(62, 62, 62)
                                                        .addComponent(B00, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(B20, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(detButton))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(18, 18, 18)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addComponent(B01, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(B02, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addComponent(B11, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(B12, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addComponent(B21, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(B22, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGap(83, 83, 83)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addComponent(C20, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(10, 10, 10)
                                                                .addComponent(C21, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(10, 10, 10)
                                                                .addComponent(C22, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addComponent(C10, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(C11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(C12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addComponent(C00, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(C01, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(C02, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(100, 100, 100)
                                                        .addComponent(jLabel5)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(detOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGap(98, 98, 98)
                                                .addComponent(invButton))))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(A20, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(A21, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(A22, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 46, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(multButton)
                            .addComponent(addButton))
                        .addGap(166, 452, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A00, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B00, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C00, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton)
                    .addComponent(detButton)
                    .addComponent(detOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exitButton)
                    .addComponent(invButton)
                    .addComponent(multButton))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        //GUI is done pretty much
        //------------------------------------------
        
        pack();
    }                        
    //addition function when add button is pressed
    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {                                          
        
        float[][] matrixA = new float[3][3];
        float[][] matrixB = new float[3][3];
        float[][] matrixC = new float[3][3];
        
        //gets the input that user inputted
        matrixA[0][0] = Float.parseFloat(A00.getText());
        matrixA[0][1] = Float.parseFloat(A01.getText());
        matrixA[0][2] = Float.parseFloat(A02.getText());
        matrixA[1][0] = Float.parseFloat(A10.getText());
        matrixA[1][1] = Float.parseFloat(A11.getText());
        matrixA[1][2] = Float.parseFloat(A12.getText());
        matrixA[2][0] = Float.parseFloat(A20.getText());
        matrixA[2][1] = Float.parseFloat(A21.getText());
        matrixA[2][2] = Float.parseFloat(A22.getText());
        
        matrixB[0][0] = Float.parseFloat(B00.getText());
        matrixB[0][1] = Float.parseFloat(B01.getText());
        matrixB[0][2] = Float.parseFloat(B02.getText());
        matrixB[1][0] = Float.parseFloat(B10.getText());
        matrixB[1][1] = Float.parseFloat(B11.getText());
        matrixB[1][2] = Float.parseFloat(B12.getText());
        matrixB[2][0] = Float.parseFloat(B20.getText());
        matrixB[2][1] = Float.parseFloat(B21.getText());
        matrixB[2][2] = Float.parseFloat(B22.getText());
        
        for(int i = 0; i < 3; i++) {
            
        	//calculation here
            for(int j = 0; j < 3; j++) {
                matrixC[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        
        C00.setText(String.valueOf(matrixC[0][0]));
        C01.setText(String.valueOf(matrixC[0][1]));
        C02.setText(String.valueOf(matrixC[0][2]));
        C10.setText(String.valueOf(matrixC[1][0]));
        C11.setText(String.valueOf(matrixC[1][1]));
        C12.setText(String.valueOf(matrixC[1][2]));
        C20.setText(String.valueOf(matrixC[2][0]));
        C21.setText(String.valueOf(matrixC[2][1]));
        C22.setText(String.valueOf(matrixC[2][2]));
        
        
    }                                         

                                     
    // alternative x button to close app
    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        System.exit(0);
        //not so complicated
    }                                          

    private void detButtonActionPerformed(java.awt.event.ActionEvent evt) {                                          
        float[][] matrixA = new float[3][3];
        
        //det and inverse both only use matrixA
        
        matrixA[0][0] = Float.parseFloat(A00.getText());
        matrixA[0][1] = Float.parseFloat(A01.getText());
        matrixA[0][2] = Float.parseFloat(A02.getText());
        matrixA[1][0] = Float.parseFloat(A10.getText());
        matrixA[1][1] = Float.parseFloat(A11.getText());
        matrixA[1][2] = Float.parseFloat(A12.getText());
        matrixA[2][0] = Float.parseFloat(A20.getText());
        matrixA[2][1] = Float.parseFloat(A21.getText());
        matrixA[2][2] = Float.parseFloat(A22.getText());
        
        float intResult = determinant(matrixA[0][0], matrixA[0][1], matrixA[0][2], matrixA[1][0], matrixA[1][1], matrixA[1][2], matrixA[2][0], matrixA[2][1], matrixA[2][2] );
        //determinant function is overloaded and partially recursive, that is, only for square size 3 or smaller. 
        
        detOutput.setText(String.valueOf(intResult));
        //answer is spat out
    }                                         
                                        

    private void invButtonActionPerformed(java.awt.event.ActionEvent evt) {                                          
        float[][] matrixA = new float[3][3];
        float[][] matrixC = new float[3][3];
        
        //inverse only uses one matrix, answer is output on matrixC
        
        matrixA[0][0] = Float.parseFloat(A00.getText());
        matrixA[0][1] = Float.parseFloat(A01.getText());
        matrixA[0][2] = Float.parseFloat(A02.getText());
        matrixA[1][0] = Float.parseFloat(A10.getText());
        matrixA[1][1] = Float.parseFloat(A11.getText());
        matrixA[1][2] = Float.parseFloat(A12.getText());
        matrixA[2][0] = Float.parseFloat(A20.getText());
        matrixA[2][1] = Float.parseFloat(A21.getText());
        matrixA[2][2] = Float.parseFloat(A22.getText());
        
        float detA = determinant(matrixA[0][0], matrixA[0][1], matrixA[0][2], matrixA[1][0], matrixA[1][1], matrixA[1][2], matrixA[2][0], matrixA[2][1], matrixA[2][2]);
        
        if(detA == 0) {
            detOutput.setText("0; inv is impossible");
            //this prevents dividing by 0; matrices with determinant 0 are noninvertable
        }
        
        else {
            
            for(int i = 0; i < 3; i++) {
                
                for(int j = 0; j < 3; j++){
                    
                    matrixC[i][j] = (1/detA) * (determinant(matrixA[(i+1)%3][(j+1)%3], matrixA[(i+1)%3][(j+2)%3], matrixA[(i+2)%3][(j+1)%3], matrixA[(i+2)%3][(j+2)%3]));
                    //convoluted but actually correct.
                    
                }
            }
            
            C00.setText(String.valueOf(matrixC[0][0]));
            C01.setText(String.valueOf(matrixC[0][1]));
            C02.setText(String.valueOf(matrixC[0][2]));
            C10.setText(String.valueOf(matrixC[1][0]));
            C11.setText(String.valueOf(matrixC[1][1]));
            C12.setText(String.valueOf(matrixC[1][2]));
            C20.setText(String.valueOf(matrixC[2][0]));
            C21.setText(String.valueOf(matrixC[2][1]));
            C22.setText(String.valueOf(matrixC[2][2]));
            
        }
        
    }                                         

    private void multButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        float[][] matrixA = new float[3][3];
        float[][] matrixB = new float[3][3];
        float[][] matrixC = new float[3][3];
        
        matrixA[0][0] = Float.parseFloat(A00.getText());
        matrixA[0][1] = Float.parseFloat(A01.getText());
        matrixA[0][2] = Float.parseFloat(A02.getText());
        matrixA[1][0] = Float.parseFloat(A10.getText());
        matrixA[1][1] = Float.parseFloat(A11.getText());
        matrixA[1][2] = Float.parseFloat(A12.getText());
        matrixA[2][0] = Float.parseFloat(A20.getText());
        matrixA[2][1] = Float.parseFloat(A21.getText());
        matrixA[2][2] = Float.parseFloat(A22.getText());
        
        matrixB[0][0] = Float.parseFloat(B00.getText());
        matrixB[0][1] = Float.parseFloat(B01.getText());
        matrixB[0][2] = Float.parseFloat(B02.getText());
        matrixB[1][0] = Float.parseFloat(B10.getText());
        matrixB[1][1] = Float.parseFloat(B11.getText());
        matrixB[1][2] = Float.parseFloat(B12.getText());
        matrixB[2][0] = Float.parseFloat(B20.getText());
        matrixB[2][1] = Float.parseFloat(B21.getText());
        matrixB[2][2] = Float.parseFloat(B22.getText());
        
        for(int i = 0; i < 3; i++) {
            
            for(int j = 0; j < 3; j++) {
                
                int modifier = ((((i + j + 1) %2) * 2) - 1);  //This makes checkerboard tiling of positive and negative modifiers
                
                int value = 0;
                
                for(int k = 0; k < 3; k++) {
                    //we're real deep now
                    value += matrixA[i][k] * matrixB[k][j]; //this is done 27 times
                }
                
                matrixC[i][j] = modifier * value;
                
            }
        }
        
        C00.setText(String.valueOf(matrixC[0][0]));
        C01.setText(String.valueOf(matrixC[0][1]));
        C02.setText(String.valueOf(matrixC[0][2]));
        C10.setText(String.valueOf(matrixC[1][0]));
        C11.setText(String.valueOf(matrixC[1][1]));
        C12.setText(String.valueOf(matrixC[1][2]));
        C20.setText(String.valueOf(matrixC[2][0]));
        C21.setText(String.valueOf(matrixC[2][1]));
        C22.setText(String.valueOf(matrixC[2][2]));
        
    }                                          

    //determinant function which is called by determinant and inverse
    //and here I do some nice OVERLOADING, showing my understanding of those -year 2 concepts-
    public float determinant(float p11, float p12, float p13, float p21, float p22, float p23, float p31, float p32, float p33) {
        float answerp = p11 * determinant(p22, p23, p32, p33) - p12 * determinant(p21, p23, p31, p33) + p13 * determinant(p21, p22, p31, p32);
        return answerp;
        
    }
    
    //overloading is such fun wohoho
    public float determinant(float q11, float q12, float q21, float q22) {
        float answerq = (q11 * determinant(q22)) - (q12 * determinant(q21));
        return answerq;
    }
    
    //now im just being extravagant
    public float determinant(float r11) {
        return r11;
    }
    
    public static void main(String args[]) {
        
    	
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MatrixCalcUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MatrixCalcUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MatrixCalcUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MatrixCalcUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MatrixCalcUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JTextField A00;
    private javax.swing.JTextField A01;
    private javax.swing.JTextField A02;
    private javax.swing.JTextField A10;
    private javax.swing.JTextField A11;
    private javax.swing.JTextField A12;
    private javax.swing.JTextField A20;
    private javax.swing.JTextField A21;
    private javax.swing.JTextField A22;
    private javax.swing.JTextField B00;
    private javax.swing.JTextField B01;
    private javax.swing.JTextField B02;
    private javax.swing.JTextField B10;
    private javax.swing.JTextField B11;
    private javax.swing.JTextField B12;
    private javax.swing.JTextField B20;
    private javax.swing.JTextField B21;
    private javax.swing.JTextField B22;
    private javax.swing.JTextField C00;
    private javax.swing.JTextField C01;
    private javax.swing.JTextField C02;
    private javax.swing.JTextField C10;
    private javax.swing.JTextField C11;
    private javax.swing.JTextField C12;
    private javax.swing.JTextField C20;
    private javax.swing.JTextField C21;
    private javax.swing.JTextField C22;
    private javax.swing.JButton addButton;
    private javax.swing.JButton detButton;
    private javax.swing.JTextField detOutput;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton invButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton multButton;
    // End of variables declaration                   
}