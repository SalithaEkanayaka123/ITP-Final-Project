/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

/**
 *
 * @author Nirmith Akash
 */
public class TMS_Home_Panel extends javax.swing.JPanel {

    /**
     * Creates new form TMS_Home_Panel
     */
    public TMS_Home_Panel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Side_panel = new javax.swing.JPanel();
        btn_add_menu = new javax.swing.JPanel();
        lbl_add_menu = new javax.swing.JLabel();
        btn_add_items = new javax.swing.JPanel();
        lbl_add_items = new javax.swing.JLabel();
        btn_create_menu = new javax.swing.JPanel();
        lbl_create_menu = new javax.swing.JLabel();
        btn_customer_order = new javax.swing.JPanel();
        lbl_customer_order = new javax.swing.JLabel();
        btn_customer_order2 = new javax.swing.JPanel();
        lbl_customer_order2 = new javax.swing.JLabel();
        btn_customer_order3 = new javax.swing.JPanel();
        lbl_customer_order3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanel5 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1360, 590));
        setMinimumSize(new java.awt.Dimension(1360, 590));
        setPreferredSize(new java.awt.Dimension(1360, 590));

        Side_panel.setBackground(new java.awt.Color(102, 102, 102));

        btn_add_menu.setBackground(new java.awt.Color(204, 204, 204));
        btn_add_menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_add_menumouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_add_menumouseEnter(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_add_menumouseExit(evt);
            }
        });

        lbl_add_menu.setBackground(new java.awt.Color(102, 102, 102));
        lbl_add_menu.setFont(new java.awt.Font("Lato", 1, 18)); // NOI18N
        lbl_add_menu.setText("Home");

        javax.swing.GroupLayout btn_add_menuLayout = new javax.swing.GroupLayout(btn_add_menu);
        btn_add_menu.setLayout(btn_add_menuLayout);
        btn_add_menuLayout.setHorizontalGroup(
            btn_add_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_add_menuLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(lbl_add_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(37, 37, 37))
        );
        btn_add_menuLayout.setVerticalGroup(
            btn_add_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_add_menuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_add_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        btn_add_items.setBackground(new java.awt.Color(204, 204, 204));
        btn_add_items.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_add_itemsmouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_add_itemsmouseEnter(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_add_itemsmouseExit(evt);
            }
        });

        lbl_add_items.setBackground(new java.awt.Color(102, 102, 102));
        lbl_add_items.setFont(new java.awt.Font("Lato", 1, 18)); // NOI18N
        lbl_add_items.setText("Driver Informaton");
        lbl_add_items.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_add_itemsMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btn_add_itemsLayout = new javax.swing.GroupLayout(btn_add_items);
        btn_add_items.setLayout(btn_add_itemsLayout);
        btn_add_itemsLayout.setHorizontalGroup(
            btn_add_itemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_add_itemsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_add_items, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        btn_add_itemsLayout.setVerticalGroup(
            btn_add_itemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_add_itemsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_add_items, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        btn_create_menu.setBackground(new java.awt.Color(204, 204, 204));
        btn_create_menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_create_menumouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_create_menumouseEnter(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_create_menumouseExit(evt);
            }
        });

        lbl_create_menu.setBackground(new java.awt.Color(102, 102, 102));
        lbl_create_menu.setFont(new java.awt.Font("Lato", 1, 18)); // NOI18N
        lbl_create_menu.setText("Vehicle Information");

        javax.swing.GroupLayout btn_create_menuLayout = new javax.swing.GroupLayout(btn_create_menu);
        btn_create_menu.setLayout(btn_create_menuLayout);
        btn_create_menuLayout.setHorizontalGroup(
            btn_create_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_create_menuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_create_menu, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                .addContainerGap())
        );
        btn_create_menuLayout.setVerticalGroup(
            btn_create_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_create_menu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        btn_customer_order.setBackground(new java.awt.Color(204, 204, 204));
        btn_customer_order.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_customer_ordermouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_customer_ordermouseEnter(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_customer_ordermouseExit(evt);
            }
        });

        lbl_customer_order.setBackground(new java.awt.Color(102, 102, 102));
        lbl_customer_order.setFont(new java.awt.Font("Lato", 1, 18)); // NOI18N
        lbl_customer_order.setText("Report");

        javax.swing.GroupLayout btn_customer_orderLayout = new javax.swing.GroupLayout(btn_customer_order);
        btn_customer_order.setLayout(btn_customer_orderLayout);
        btn_customer_orderLayout.setHorizontalGroup(
            btn_customer_orderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_customer_orderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_customer_order, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        btn_customer_orderLayout.setVerticalGroup(
            btn_customer_orderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_customer_orderLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(lbl_customer_order, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        btn_customer_order2.setBackground(new java.awt.Color(204, 204, 204));
        btn_customer_order2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_customer_order2mouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_customer_order2mouseEnter(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_customer_order2mouseExit(evt);
            }
        });

        lbl_customer_order2.setBackground(new java.awt.Color(102, 102, 102));
        lbl_customer_order2.setFont(new java.awt.Font("Lato", 1, 18)); // NOI18N
        lbl_customer_order2.setText("Add Driver");

        javax.swing.GroupLayout btn_customer_order2Layout = new javax.swing.GroupLayout(btn_customer_order2);
        btn_customer_order2.setLayout(btn_customer_order2Layout);
        btn_customer_order2Layout.setHorizontalGroup(
            btn_customer_order2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_customer_order2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lbl_customer_order2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        btn_customer_order2Layout.setVerticalGroup(
            btn_customer_order2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_customer_order2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btn_customer_order3.setBackground(new java.awt.Color(204, 204, 204));
        btn_customer_order3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_customer_order3mouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_customer_order3mouseEnter(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_customer_order3mouseExit(evt);
            }
        });

        lbl_customer_order3.setBackground(new java.awt.Color(102, 102, 102));
        lbl_customer_order3.setFont(new java.awt.Font("Lato", 1, 18)); // NOI18N
        lbl_customer_order3.setText("Add Vehicle");

        javax.swing.GroupLayout btn_customer_order3Layout = new javax.swing.GroupLayout(btn_customer_order3);
        btn_customer_order3.setLayout(btn_customer_order3Layout);
        btn_customer_order3Layout.setHorizontalGroup(
            btn_customer_order3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_customer_order3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lbl_customer_order3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        btn_customer_order3Layout.setVerticalGroup(
            btn_customer_order3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_customer_order3, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.black, null, null));

        jLabel1.setText("Driver's Status");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(jList1);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.black, null, null));

        jLabel3.setText("Vehicle's Status");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane5.setViewportView(jList2);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(4, 4, 4))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setText("Transport Management System");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(33, 33, 33))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(253, 253, 253)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 591, Short.MAX_VALUE)
                .addGap(229, 229, 229))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout Side_panelLayout = new javax.swing.GroupLayout(Side_panel);
        Side_panel.setLayout(Side_panelLayout);
        Side_panelLayout.setHorizontalGroup(
            Side_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Side_panelLayout.createSequentialGroup()
                .addGroup(Side_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_add_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_add_items, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_create_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_customer_order, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_customer_order2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_customer_order3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        Side_panelLayout.setVerticalGroup(
            Side_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Side_panelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(btn_add_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(163, 163, 163)
                .addComponent(btn_add_items, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_create_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_customer_order, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_customer_order2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_customer_order3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Side_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(Side_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_add_menumouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_add_menumouseClicked
        // TODO add your handling code here:
        //UI Related Code
        if(evt.getSource() == btn_add_menu){
            MainMenu menu = new MainMenu();
            this.setVisible(false);
            menu.setVisible(true);
            System.out.println("Clicked");

        }

    }//GEN-LAST:event_btn_add_menumouseClicked

    private void btn_add_menumouseEnter(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_add_menumouseEnter
        // TODO add your handling code here:
        //UI Related Code

    }//GEN-LAST:event_btn_add_menumouseEnter

    private void btn_add_menumouseExit(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_add_menumouseExit
        // TODO add your handling code here:
        //UI Related Code

    }//GEN-LAST:event_btn_add_menumouseExit

    private void lbl_add_itemsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_add_itemsMouseClicked
        // TODO add your handling code here:
        //open jframe for driverinfo

        //        Driverinfo di = new Driverinfo();
        //        di.show();//display fram here
        //
        //        dispose();//close current frame after open
    }//GEN-LAST:event_lbl_add_itemsMouseClicked

    private void btn_add_itemsmouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_add_itemsmouseClicked
        // TODO add your handling code here:
        //UI Related Code

        //Panel Selecting Command

    }//GEN-LAST:event_btn_add_itemsmouseClicked

    private void btn_add_itemsmouseEnter(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_add_itemsmouseEnter
        // TODO add your handling code here:
        //UI Related Code

    }//GEN-LAST:event_btn_add_itemsmouseEnter

    private void btn_add_itemsmouseExit(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_add_itemsmouseExit
        // TODO add your handling code here:
        //UI Related Code

    }//GEN-LAST:event_btn_add_itemsmouseExit

    private void btn_create_menumouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_create_menumouseClicked
//        // TODO add your handling code here:
//        Vehicleinfo Vinfo = new Vehicleinfo();
//        Vinfo.show();//display fram here
//
//        dispose();//close current frame after open
    }//GEN-LAST:event_btn_create_menumouseClicked

    private void btn_create_menumouseEnter(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_create_menumouseEnter
        // TODO add your handling code here:
        //UI Related Code
    }//GEN-LAST:event_btn_create_menumouseEnter

    private void btn_create_menumouseExit(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_create_menumouseExit
        // TODO add your handling code here:
        //UI Related Code

    }//GEN-LAST:event_btn_create_menumouseExit

    private void btn_customer_ordermouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_customer_ordermouseClicked
        //        // TODO add your handling code here:
        //        TMS_report TMSRP = new TMS_report();
        //        TMSRP.show();//display fram here
        //
        //        dispose();//close current frame after open

    }//GEN-LAST:event_btn_customer_ordermouseClicked

    private void btn_customer_ordermouseEnter(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_customer_ordermouseEnter
        // TODO add your handling code here:
        //UI Related Code

    }//GEN-LAST:event_btn_customer_ordermouseEnter

    private void btn_customer_ordermouseExit(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_customer_ordermouseExit
        // TODO add your handling code here:
        //UI Related Code

    }//GEN-LAST:event_btn_customer_ordermouseExit

    private void btn_customer_order2mouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_customer_order2mouseClicked
        //        // TODO add your handling code here:
        //        addDriver addDR = new addDriver();
        //        addDR.show();//display fram here
        //
        //        dispose();//close current frame after open
    }//GEN-LAST:event_btn_customer_order2mouseClicked

    private void btn_customer_order2mouseEnter(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_customer_order2mouseEnter
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_customer_order2mouseEnter

    private void btn_customer_order2mouseExit(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_customer_order2mouseExit
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_customer_order2mouseExit

    private void btn_customer_order3mouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_customer_order3mouseClicked
//        // TODO add your handling code here:
//        addVehicle addVH = new addVehicle();
//        addVH.show();//display fram here
//
//        dispose();//close current frame after open
    }//GEN-LAST:event_btn_customer_order3mouseClicked

    private void btn_customer_order3mouseEnter(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_customer_order3mouseEnter
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_customer_order3mouseEnter

    private void btn_customer_order3mouseExit(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_customer_order3mouseExit
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_customer_order3mouseExit


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Side_panel;
    private javax.swing.JPanel btn_add_items;
    private javax.swing.JPanel btn_add_menu;
    private javax.swing.JPanel btn_create_menu;
    private javax.swing.JPanel btn_customer_order;
    private javax.swing.JPanel btn_customer_order2;
    private javax.swing.JPanel btn_customer_order3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lbl_add_items;
    private javax.swing.JLabel lbl_add_menu;
    private javax.swing.JLabel lbl_create_menu;
    private javax.swing.JLabel lbl_customer_order;
    private javax.swing.JLabel lbl_customer_order2;
    private javax.swing.JLabel lbl_customer_order3;
    // End of variables declaration//GEN-END:variables
}
