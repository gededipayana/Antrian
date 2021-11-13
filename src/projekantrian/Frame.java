package projekantrian;

import java.util.ArrayList;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Frame extends javax.swing.JFrame {

    Mahasiswa mhsRU;
    Mahasiswa mhsAlmetKtm;
    Mahasiswa mhsTA;

    LinkedListAntrian listRegistrasiUlang = new LinkedListAntrian();
    LinkedListAntrian listAlmetKtm = new LinkedListAntrian();
    LinkedListAntrian listTA = new LinkedListAntrian();

    int noAntrianRegistrasiUlang = 1;
    int noAntrianAlmetKtm = 1;
    int noAntrianTA = 1;

    ButtonGroup jenisAntrian;

    public Frame() {
        initComponents();

        jenisAntrian = new ButtonGroup();
        jenisAntrian.add(selectRegistrasiUlang);
        jenisAntrian.add(selectAlmetKTM);
        jenisAntrian.add(selectTA);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelUtama = new javax.swing.JPanel();
        panelMenu = new javax.swing.JPanel();
        buttonUser = new javax.swing.JButton();
        buttonLoket = new javax.swing.JButton();
        buttonHome = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        panelMain = new javax.swing.JPanel();
        panelHome = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        panelKeterangan = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        panelUser = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        panelAdd = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        textNim = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        textNama = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        selectRegistrasiUlang = new javax.swing.JRadioButton();
        selectAlmetKTM = new javax.swing.JRadioButton();
        selectTA = new javax.swing.JRadioButton();
        buttonADD = new javax.swing.JButton();
        buttonCari = new javax.swing.JButton();
        panelLoket = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelRegistrasiUlang = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        buttonCallRegUl = new javax.swing.JButton();
        textCallRegUl = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelAlmetKtm = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabelTA = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        buttonCallAlKtm = new javax.swing.JButton();
        textCallAlKtm = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        buttonCallTA = new javax.swing.JButton();
        textCallTA = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Antrian Baa");

        panelUtama.setBackground(new java.awt.Color(255, 204, 0));

        panelMenu.setBackground(new java.awt.Color(255, 102, 51));

        buttonUser.setText("User");
        buttonUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUserActionPerformed(evt);
            }
        });

        buttonLoket.setText("Loket");
        buttonLoket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLoketActionPerformed(evt);
            }
        });

        buttonHome.setText("Home");
        buttonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHomeActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Calibri", 3, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("USD");

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Calibri", 3, 30)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("OFFICIAL");

        jLabel24.setBackground(new java.awt.Color(255, 255, 255));
        jLabel24.setFont(new java.awt.Font("Calibri", 3, 30)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("BAA");

        jLabel25.setBackground(new java.awt.Color(255, 255, 255));
        jLabel25.setFont(new java.awt.Font("Calibri", 3, 20)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Cerdas dan");
        jLabel25.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel26.setBackground(new java.awt.Color(255, 255, 255));
        jLabel26.setFont(new java.awt.Font("Calibri", 3, 20)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Humanis");
        jLabel26.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonUser, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonLoket, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addGap(93, 93, 93)
                .addComponent(buttonHome, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(buttonUser, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(buttonLoket, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel26)
                .addGap(56, 56, 56))
        );

        panelMain.setBackground(new java.awt.Color(255, 153, 0));
        panelMain.setLayout(new java.awt.CardLayout());

        panelHome.setBackground(new java.awt.Color(255, 204, 0));

        jLabel21.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("UNIVERSITAS SANATA DHARMA");

        jLabel22.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("BIRO ADMINISTRASI AKADEMIK");

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/logo sadhar.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 60)); // NOI18N
        jLabel1.setText("W  E  L  C  O  M  E     T  O");

        panelKeterangan.setBackground(new java.awt.Color(255, 204, 0));
        panelKeterangan.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("JL. AFFANDI, MRICAN, TROMPOL POS 29, YOGYAKARTA 55002");

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Telp. (0274) 513301, 515352  Fax. (0274) 562383 - Telegram : SADHAR YOGYA - Homepage : http://www.usd.ac.id ");

        javax.swing.GroupLayout panelKeteranganLayout = new javax.swing.GroupLayout(panelKeterangan);
        panelKeterangan.setLayout(panelKeteranganLayout);
        panelKeteranganLayout.setHorizontalGroup(
            panelKeteranganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKeteranganLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelKeteranganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelKeteranganLayout.setVerticalGroup(
            panelKeteranganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKeteranganLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelHomeLayout = new javax.swing.GroupLayout(panelHome);
        panelHome.setLayout(panelHomeLayout);
        panelHomeLayout.setHorizontalGroup(
            panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHomeLayout.createSequentialGroup()
                .addGroup(panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelHomeLayout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addGroup(panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelHomeLayout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(panelKeterangan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelHomeLayout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addComponent(jLabel21))
                    .addGroup(panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(panelHomeLayout.createSequentialGroup()
                            .addGap(455, 455, 455)
                            .addComponent(jLabel23)
                            .addGap(202, 202, 202))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelHomeLayout.createSequentialGroup()
                            .addGap(231, 231, 231)
                            .addComponent(jLabel1))))
                .addContainerGap(242, Short.MAX_VALUE))
        );
        panelHomeLayout.setVerticalGroup(
            panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHomeLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel23)
                .addGap(55, 55, 55)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, Short.MAX_VALUE)
                .addComponent(panelKeterangan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelMain.add(panelHome, "card4");

        panelUser.setBackground(new java.awt.Color(255, 204, 0));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/logo sadhar.png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("BIRO ADMINISTRASI AKADEMIK");

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("UNIVERSITAS SANATA DHARMA");

        panelAdd.setBackground(new java.awt.Color(255, 204, 0));
        panelAdd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setText("NIM");

        textNim.setBackground(new java.awt.Color(255, 204, 0));

        jLabel16.setText("NAMA");

        textNama.setBackground(new java.awt.Color(255, 204, 0));

        jLabel17.setText("Jenis Antrian ");

        selectRegistrasiUlang.setBackground(new java.awt.Color(255, 204, 0));
        selectRegistrasiUlang.setText("Registrasi Ulang");

        selectAlmetKTM.setBackground(new java.awt.Color(255, 204, 0));
        selectAlmetKTM.setText("Pengambilan Almamater & KTM");

        selectTA.setBackground(new java.awt.Color(255, 204, 0));
        selectTA.setText("Pendaftaran Tugas Akhir");

        buttonADD.setBackground(new java.awt.Color(0, 204, 102));
        buttonADD.setText("ADD");
        buttonADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonADDActionPerformed(evt);
            }
        });

        buttonCari.setBackground(new java.awt.Color(0, 153, 204));
        buttonCari.setText("Search");
        buttonCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCariActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAddLayout = new javax.swing.GroupLayout(panelAdd);
        panelAdd.setLayout(panelAddLayout);
        panelAddLayout.setHorizontalGroup(
            panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(48, 48, 48)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAddLayout.createSequentialGroup()
                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelAddLayout.createSequentialGroup()
                                .addComponent(buttonADD, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(buttonCari, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(selectTA)
                            .addComponent(selectAlmetKTM))
                        .addGap(0, 72, Short.MAX_VALUE))
                    .addGroup(panelAddLayout.createSequentialGroup()
                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(textNama, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                            .addComponent(selectRegistrasiUlang, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textNim, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        panelAddLayout.setVerticalGroup(
            panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textNim, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textNama, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectRegistrasiUlang))
                .addGap(18, 18, 18)
                .addComponent(selectAlmetKTM)
                .addGap(18, 18, 18)
                .addComponent(selectTA)
                .addGap(18, 18, 18)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonADD)
                    .addComponent(buttonCari))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelUserLayout = new javax.swing.GroupLayout(panelUser);
        panelUser.setLayout(panelUserLayout);
        panelUserLayout.setHorizontalGroup(
            panelUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUserLayout.createSequentialGroup()
                .addGroup(panelUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelUserLayout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelUserLayout.createSequentialGroup()
                        .addGap(262, 262, 262)
                        .addComponent(jLabel9))
                    .addGroup(panelUserLayout.createSequentialGroup()
                        .addGap(313, 313, 313)
                        .addComponent(panelAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelUserLayout.createSequentialGroup()
                        .addGap(410, 410, 410)
                        .addComponent(jLabel7)))
                .addContainerGap(275, Short.MAX_VALUE))
        );
        panelUserLayout.setVerticalGroup(
            panelUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUserLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(panelAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(86, Short.MAX_VALUE))
        );

        panelMain.add(panelUser, "card2");

        panelLoket.setBackground(new java.awt.Color(255, 204, 0));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/logo sadhar.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("BIRO ADMINISTRASI AKADEMIK");

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("UNIVERSITAS SANATA DHARMA");

        jPanel1.setBackground(new java.awt.Color(255, 204, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.setPreferredSize(new java.awt.Dimension(300, 170));

        tabelRegistrasiUlang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No Antrian", "NIM", "Nama"
            }
        ));
        jScrollPane2.setViewportView(tabelRegistrasiUlang);

        jLabel10.setText("Registrasi Ulang");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jLabel10)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 204, 0));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel11.setText("Registrasi Ulang");

        buttonCallRegUl.setBackground(new java.awt.Color(0, 204, 102));
        buttonCallRegUl.setText("CALL");
        buttonCallRegUl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCallRegUlActionPerformed(evt);
            }
        });

        textCallRegUl.setBackground(new java.awt.Color(255, 204, 0));
        textCallRegUl.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        textCallRegUl.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(buttonCallRegUl)
                        .addGap(27, 27, 27)
                        .addComponent(textCallRegUl, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jLabel11)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(buttonCallRegUl))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(textCallRegUl, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 204, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel2.setPreferredSize(new java.awt.Dimension(300, 170));

        tabelAlmetKtm.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No Antrian", "NIM", "Nama"
            }
        ));
        jScrollPane1.setViewportView(tabelAlmetKtm);

        jLabel12.setText("Pengambilan Almamater & KTM");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 204, 0));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel4.setPreferredSize(new java.awt.Dimension(300, 170));

        tabelTA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No Antrian", "NIM", "Nama"
            }
        ));
        jScrollPane4.setViewportView(tabelTA);

        jLabel13.setText("Pendaftaran Tugas Akhir");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(255, 204, 0));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel14.setText("Pengambilan Almamater & KTM");

        buttonCallAlKtm.setBackground(new java.awt.Color(0, 204, 102));
        buttonCallAlKtm.setText("CALL");
        buttonCallAlKtm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCallAlKtmActionPerformed(evt);
            }
        });

        textCallAlKtm.setBackground(new java.awt.Color(255, 204, 0));
        textCallAlKtm.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        textCallAlKtm.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(buttonCallAlKtm)
                        .addGap(27, 27, 27)
                        .addComponent(textCallAlKtm, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel14)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(buttonCallAlKtm))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(textCallAlKtm, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 204, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel15.setText("Pendaftaran Tugas Akhir");

        buttonCallTA.setBackground(new java.awt.Color(0, 204, 102));
        buttonCallTA.setText("CALL");
        buttonCallTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCallTAActionPerformed(evt);
            }
        });

        textCallTA.setBackground(new java.awt.Color(255, 204, 0));
        textCallTA.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        textCallTA.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonCallTA)
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(textCallTA, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(buttonCallTA))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(textCallTA, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelLoketLayout = new javax.swing.GroupLayout(panelLoket);
        panelLoket.setLayout(panelLoketLayout);
        panelLoketLayout.setHorizontalGroup(
            panelLoketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoketLayout.createSequentialGroup()
                .addGroup(panelLoketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLoketLayout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLoketLayout.createSequentialGroup()
                        .addGap(262, 262, 262)
                        .addComponent(jLabel6))
                    .addGroup(panelLoketLayout.createSequentialGroup()
                        .addGap(410, 410, 410)
                        .addComponent(jLabel4)))
                .addContainerGap(275, Short.MAX_VALUE))
            .addGroup(panelLoketLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panelLoketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(77, 77, 77)
                .addGroup(panelLoketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelLoketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29))
        );
        panelLoketLayout.setVerticalGroup(
            panelLoketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoketLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(panelLoketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelLoketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        panelMain.add(panelLoket, "card3");

        javax.swing.GroupLayout panelUtamaLayout = new javax.swing.GroupLayout(panelUtama);
        panelUtama.setLayout(panelUtamaLayout);
        panelUtamaLayout.setHorizontalGroup(
            panelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUtamaLayout.createSequentialGroup()
                .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelUtamaLayout.setVerticalGroup(
            panelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelUtamaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(panelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelUtama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelUtama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUserActionPerformed
        panelMain.removeAll();
        panelMain.repaint();
        panelMain.revalidate();

        panelMain.add(panelUser);
        panelMain.repaint();
        panelMain.revalidate();
    }//GEN-LAST:event_buttonUserActionPerformed

    private void buttonLoketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLoketActionPerformed
        panelMain.removeAll();
        panelMain.repaint();
        panelMain.revalidate();

        panelMain.add(panelLoket);
        panelMain.repaint();
        panelMain.revalidate();
    }//GEN-LAST:event_buttonLoketActionPerformed

    private void buttonCallRegUlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCallRegUlActionPerformed
        try {
            if (listRegistrasiUlang.size != -1) {
                textCallRegUl.setText(String.valueOf(listRegistrasiUlang.dequeue().elemen.getNoAntrian()));
            }
            tampilRegistrasiUlang();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Antrian Kosong",
                    "Antrian Loket Registrasi Ulang", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_buttonCallRegUlActionPerformed

    private void buttonCallAlKtmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCallAlKtmActionPerformed
        try {
            if (listAlmetKtm.size != -1) {
                textCallAlKtm.setText(String.valueOf(listAlmetKtm.dequeue().elemen.getNoAntrian()));
            }
            tampilAlmetKtm();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Antrian Kosong",
                    "Antrian Loket Pengambilan Almamater & KTM", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_buttonCallAlKtmActionPerformed

    private void buttonCallTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCallTAActionPerformed
        try {
            if (listTA.size != -1) {
                textCallTA.setText(String.valueOf(listTA.dequeue().elemen.getNoAntrian()));
            }
            tampilDaftarTa();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Antrian Kosong",
                    "Antrian Loket Pendaftaran Tugas Akhir", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_buttonCallTAActionPerformed

    private void buttonADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonADDActionPerformed

        if (selectRegistrasiUlang.isSelected()) {

            mhsRU = new Mahasiswa(noAntrianRegistrasiUlang++, textNim.getText(), textNama.getText());
            listRegistrasiUlang.enqueue(mhsRU);

            JOptionPane.showMessageDialog(null, mhsRU.getNama() + " anda mendapat nomor antrian "
                    + mhsRU.getNoAntrian(), "Antrian Loket Registrasi Ulang", JOptionPane.INFORMATION_MESSAGE);

            tampilRegistrasiUlang();

        } else if (selectAlmetKTM.isSelected()) {

            mhsAlmetKtm = new Mahasiswa(noAntrianAlmetKtm++, textNim.getText(), textNama.getText());
            listAlmetKtm.enqueue(mhsAlmetKtm);

            JOptionPane.showMessageDialog(null, mhsAlmetKtm.getNama() + " anda mendapat nomor antrian "
                    + mhsAlmetKtm.getNoAntrian(), "Antrian Loket Pengambilan Almamater & KTM", JOptionPane.INFORMATION_MESSAGE);

            tampilAlmetKtm();

        } else if (selectTA.isSelected()) {

            mhsTA = new Mahasiswa(noAntrianTA++, textNim.getText(), textNama.getText());
            listTA.enqueue(mhsTA);

            JOptionPane.showMessageDialog(null, mhsTA.getNama() + " anda mendapat nomor antrian "
                    + mhsTA.getNoAntrian(), "Antrian Loket Pendaftaran Tugas Akhir", JOptionPane.INFORMATION_MESSAGE);

            tampilDaftarTa();
        } else {
            JOptionPane.showMessageDialog(null, " Silahkan Isi Semua Data Terlebih Dahulu ",
                    " Error ", JOptionPane.ERROR_MESSAGE);
        }
        clear();
    }//GEN-LAST:event_buttonADDActionPerformed

    private void buttonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHomeActionPerformed
        panelMain.removeAll();
        panelMain.repaint();
        panelMain.revalidate();

        panelMain.add(panelHome);
        panelMain.repaint();
        panelMain.revalidate();
    }//GEN-LAST:event_buttonHomeActionPerformed

    private void buttonCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCariActionPerformed
        if (selectRegistrasiUlang.isSelected()) {
            cariRegisUlang(textNim.getText());
        } else if (selectAlmetKTM.isSelected()) {
            cariAlmetKtm(textNim.getText());
        } else if (selectTA.isSelected()) {
            cariDaftarTA(textNim.getText());
        } else {
            JOptionPane.showMessageDialog(null, " Silahkan Isi Semua Data Terlebih Dahulu ",
                    " Error ", JOptionPane.ERROR_MESSAGE);
        }
        clear();
    }//GEN-LAST:event_buttonCariActionPerformed

    private void tampilRegistrasiUlang() {
        tabelRegistrasiUlang.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "No Antrian", "NIM", "NAMA"
                }
        ));

        DefaultTableModel modelTabel = (DefaultTableModel) tabelRegistrasiUlang.getModel();
        Antrian bantu = listRegistrasiUlang.getHead().next;

        while (bantu != listRegistrasiUlang.getHead()) {
            Mahasiswa mahasiswaDaftarUlang = (Mahasiswa) bantu.elemen;
            List listbantu = new ArrayList<>();
            tabelRegistrasiUlang.setAutoCreateColumnsFromModel(true);
            listbantu.add(mahasiswaDaftarUlang.getNoAntrian());
            listbantu.add(mahasiswaDaftarUlang.getNim());
            listbantu.add(mahasiswaDaftarUlang.getNama());
            modelTabel.addRow(listbantu.toArray());
            bantu = bantu.next;
        }
    }

    private void tampilAlmetKtm() {
        tabelAlmetKtm.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "No Antrian", "NIM", "NAMA"
                }
        ));

        DefaultTableModel modelTabel = (DefaultTableModel) tabelAlmetKtm.getModel();
        Antrian bantu = listAlmetKtm.getHead().next;

        while (bantu != listAlmetKtm.getHead()) {
            Mahasiswa mahasiswaAlmetKtm = (Mahasiswa) bantu.elemen;
            List listbantu = new ArrayList<>();
            tabelAlmetKtm.setAutoCreateColumnsFromModel(true);
            listbantu.add(mahasiswaAlmetKtm.getNoAntrian());
            listbantu.add(mahasiswaAlmetKtm.getNim());
            listbantu.add(mahasiswaAlmetKtm.getNama());
            modelTabel.addRow(listbantu.toArray());
            bantu = bantu.next;
        }
    }

    private void tampilDaftarTa() {
        tabelTA.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "No Antrian", "NIM", "NAMA"
                }
        ));

        DefaultTableModel modelTabel = (DefaultTableModel) tabelTA.getModel();
        Antrian bantu = listTA.getHead().next;

        while (bantu != listTA.getHead()) {
            Mahasiswa mahasiswaTA = (Mahasiswa) bantu.elemen;
            List listbantu = new ArrayList<>();
            tabelTA.setAutoCreateColumnsFromModel(true);
            listbantu.add(mahasiswaTA.getNoAntrian());
            listbantu.add(mahasiswaTA.getNim());
            listbantu.add(mahasiswaTA.getNama());
            modelTabel.addRow(listbantu.toArray());
            bantu = bantu.next;
        }
    }

    private void clear() {
        textNama.setText("");
        textNim.setText("");
        jenisAntrian.clearSelection();
    }

    private void cariRegisUlang(String cari) {
        Antrian bantu = listRegistrasiUlang.getHead().next;
        boolean find = false;
        while (bantu != listRegistrasiUlang.getHead()) {
            Mahasiswa mhsRUbantu = (Mahasiswa) bantu.elemen;
            if (mhsRUbantu.getNim().equals(cari)) {
                find = true;
            }
            bantu = bantu.next;
        }
        if (find) {
            JOptionPane.showMessageDialog(null, " Anda terdapat dalam antrian ",
                    " Cari Antrian Loket Registrasi Ulang", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, " Anda tidak terdapat dalam antrian ",
                    " Cari Antrian Loket Registrasi Ulang", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void cariAlmetKtm(String cari) {
        Antrian bantu = listAlmetKtm.getHead().next;
        boolean find = false;
        while (bantu != listAlmetKtm.getHead()) {
            Mahasiswa mhsAlmetKtmbantu = (Mahasiswa) bantu.elemen;
            if (mhsAlmetKtmbantu.getNim().equals(cari)) {
                find = true;
            }
            bantu = bantu.next;
        }
        if (find) {
            JOptionPane.showMessageDialog(null, " Anda terdapat dalam antrian ",
                    " Cari Antrian Loket Pengambilan Almamater & KTM", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, " Anda tidak terdapat dalam antrian ",
                    " Cari Antrian Loket Pengambilan Almamater & KTM", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void cariDaftarTA(String cari) {
        Antrian bantu = listTA.getHead().next;
        boolean find = false;
        while (bantu != listTA.getHead()) {
            Mahasiswa mhsDaftarTAbantu = (Mahasiswa) bantu.elemen;
            if (mhsDaftarTAbantu.getNim().equals(cari)) {
                find = true;
            }
            bantu = bantu.next;
        }
        if (find) {
            JOptionPane.showMessageDialog(null, " Anda terdapat dalam antrian ",
                    " Cari Antrian Loket Pendaftaran Tugas Akhir", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, " Anda tidak terdapat dalam antrian ",
                    " Cari Antrian Loket Pendaftaran Tugas Akhir", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonADD;
    private javax.swing.JButton buttonCallAlKtm;
    private javax.swing.JButton buttonCallRegUl;
    private javax.swing.JButton buttonCallTA;
    private javax.swing.JButton buttonCari;
    private javax.swing.JButton buttonHome;
    private javax.swing.JButton buttonLoket;
    private javax.swing.JButton buttonUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPanel panelAdd;
    private javax.swing.JPanel panelHome;
    private javax.swing.JPanel panelKeterangan;
    private javax.swing.JPanel panelLoket;
    private javax.swing.JPanel panelMain;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panelUser;
    private javax.swing.JPanel panelUtama;
    private javax.swing.JRadioButton selectAlmetKTM;
    private javax.swing.JRadioButton selectRegistrasiUlang;
    private javax.swing.JRadioButton selectTA;
    private javax.swing.JTable tabelAlmetKtm;
    private javax.swing.JTable tabelRegistrasiUlang;
    private javax.swing.JTable tabelTA;
    private javax.swing.JTextField textCallAlKtm;
    private javax.swing.JTextField textCallRegUl;
    private javax.swing.JTextField textCallTA;
    private javax.swing.JTextField textNama;
    private javax.swing.JTextField textNim;
    // End of variables declaration//GEN-END:variables
}
