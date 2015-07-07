/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.DonatorController;
import controller.IncomeController;
import controller.IncomeReasonController;
import controller.ResponsibleController;
import functionalities.ComboSearch;
import functionalities.IdGenerator;
import functionalities.LoadCombo;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ershadi
 */
public class ManageIncome extends javax.swing.JFrame {

    private IdGenerator idGenerator;
    private LoadCombo comboBoxFunctions;
    private ComboSearch comboSearch1;
    private ComboSearch comboSearch2;
    private ComboSearch comboSearch3;
    private ComboSearch comboSearch4;
    SimpleDateFormat simpleDateFormat;
    DefaultTableModel dtmForSearch;
    DefaultTableModel dtmForUpdate;
    DefaultTableModel dtmForDelete;
    IncomeController incomeController;
    DonatorController donatorController;
    IncomeReasonController incomeReasonController;
    ResponsibleController responsibleController;
    Object object[];

    /**
     * Creates new form ManageIncome
     */
    public ManageIncome() {
        try {
            initComponents();

            idGenerator = new IdGenerator();
            comboBoxFunctions = new LoadCombo();
            comboSearch1 = new ComboSearch();
            comboSearch2 = new ComboSearch();
            comboSearch3 = new ComboSearch();
            comboSearch4 = new ComboSearch();
            simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            incomeController = new IncomeController();
            donatorController = new DonatorController();
            incomeReasonController = new IncomeReasonController();
            responsibleController = new ResponsibleController();

            add_incomeIdLabel.setText(idGenerator.generateId("ii"));

            dtmForSearch = (DefaultTableModel) search_incomeTable.getModel();
            dtmForUpdate = (DefaultTableModel) update_incomeTable.getModel();
            dtmForDelete = (DefaultTableModel) delete_incomeTable.getModel();

            loadComboInAddIncomeTab();
            loadComboInSearchIncomeTab();
            loadComboInUpdateIncomeTab();
            loadComboInDeleteIncomeTab();

            search_date1CalendarCombo.setEnabled(false);
            search_date2CalendarCombo.setEnabled(false);
            search_reasonComboBox.setEnabled(false);
            search_donatorComboBox.setEnabled(false);
            search_takerComboBox.setEnabled(false);
            search_idComboBox.setEnabled(false);
            search_amountTextField.setEnabled(false);
            search_date1Label.setEnabled(false);
            search_date2Label.setEnabled(false);
            search_reasonLabel.setEnabled(false);
            search_donatorLabel.setEnabled(false);
            search_takerLabel.setEnabled(false);
            search_idLabel.setEnabled(false);
            search_amountLabel.setEnabled(false);

            update_date1CalendarCombo.setEnabled(false);
            update_date2CalendarCombo.setEnabled(false);
            update_reasonComboBox.setEnabled(false);
            update_donatorComboBox.setEnabled(false);
            update_takerComboBox.setEnabled(false);
            update_idComboBox.setEnabled(false);
            update_amountTextField.setEnabled(false);
            update_date1Label.setEnabled(false);
            update_date2Label.setEnabled(false);
            update_reasonLabel.setEnabled(false);
            update_donatorLabel.setEnabled(false);
            update_takerLabel.setEnabled(false);
            update_idLabel.setEnabled(false);
            update_amountLabel.setEnabled(false);

            delete_date1CalendarCombo.setEnabled(false);
            delete_date2CalendarCombo.setEnabled(false);
            delete_reasonComboBox.setEnabled(false);
            delete_donatorComboBox.setEnabled(false);
            delete_takerComboBox.setEnabled(false);
            delete_idComboBox.setEnabled(false);
            delete_amountTextField.setEnabled(false);
            delete_date1Label.setEnabled(false);
            delete_date2Label.setEnabled(false);
            delete_reasonLabel.setEnabled(false);
            delete_donatorLabel.setEnabled(false);
            delete_takerLabel.setEnabled(false);
            delete_idLabel.setEnabled(false);
            delete_amountLabel.setEnabled(false);

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ManageIncome.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        manageIncomeTabbedPane = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        add_donatorComboBox = new javax.swing.JComboBox();
        add_donationReasonComboBox = new javax.swing.JComboBox();
        add_amountTextField = new javax.swing.JTextField();
        add_dateCalendar = new org.freixas.jcalendar.JCalendar();
        add_responsibleComboBox = new javax.swing.JComboBox();
        add_saveAndPrintButton = new javax.swing.JButton();
        add_saveButton = new javax.swing.JButton();
        add_donatorButton = new javax.swing.JButton();
        add_reasonButton = new javax.swing.JButton();
        add_responsibleButton = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        add_incomeIdLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        search_dateCheckBox = new javax.swing.JCheckBox();
        search_rangeOfDatesCheckBox = new javax.swing.JCheckBox();
        search_reasonCheckBox = new javax.swing.JCheckBox();
        search_donatorCheckBox = new javax.swing.JCheckBox();
        search_takerCheckBox = new javax.swing.JCheckBox();
        search_amountCheckBox = new javax.swing.JCheckBox();
        search_moreThanAmountCheckBox = new javax.swing.JCheckBox();
        search_lessThanAmountCheckBox = new javax.swing.JCheckBox();
        jPanel5 = new javax.swing.JPanel();
        search_date1Label = new javax.swing.JLabel();
        search_date1CalendarCombo = new org.freixas.jcalendar.JCalendarCombo();
        search_date2Label = new javax.swing.JLabel();
        search_date2CalendarCombo = new org.freixas.jcalendar.JCalendarCombo();
        search_reasonLabel = new javax.swing.JLabel();
        search_reasonComboBox = new javax.swing.JComboBox();
        search_donatorLabel = new javax.swing.JLabel();
        search_donatorComboBox = new javax.swing.JComboBox();
        search_takerLabel = new javax.swing.JLabel();
        search_takerComboBox = new javax.swing.JComboBox();
        search_amountLabel = new javax.swing.JLabel();
        search_amountTextField = new javax.swing.JTextField();
        search_idLabel = new javax.swing.JLabel();
        search_idComboBox = new javax.swing.JComboBox();
        jButton6 = new javax.swing.JButton();
        search_searchButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        search_incomeTable = new javax.swing.JTable();
        search_idCheckBox = new javax.swing.JCheckBox();
        jPanel8 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        update_dateCheckBox = new javax.swing.JCheckBox();
        update_rangeOfDatesCheckBox = new javax.swing.JCheckBox();
        update_reasonCheckBox = new javax.swing.JCheckBox();
        update_donatorCheckBox = new javax.swing.JCheckBox();
        update_takerCheckBox = new javax.swing.JCheckBox();
        update_amountCheckBox = new javax.swing.JCheckBox();
        update_moreThanAmountCheckBox = new javax.swing.JCheckBox();
        update_lessThanAmountCheckBox = new javax.swing.JCheckBox();
        jPanel9 = new javax.swing.JPanel();
        update_date1Label = new javax.swing.JLabel();
        update_date1CalendarCombo = new org.freixas.jcalendar.JCalendarCombo();
        update_date2Label = new javax.swing.JLabel();
        update_date2CalendarCombo = new org.freixas.jcalendar.JCalendarCombo();
        update_reasonLabel = new javax.swing.JLabel();
        update_reasonComboBox = new javax.swing.JComboBox();
        update_donatorLabel = new javax.swing.JLabel();
        update_donatorComboBox = new javax.swing.JComboBox();
        update_takerLabel = new javax.swing.JLabel();
        update_takerComboBox = new javax.swing.JComboBox();
        update_amountLabel = new javax.swing.JLabel();
        update_amountTextField = new javax.swing.JTextField();
        update_idLabel = new javax.swing.JLabel();
        update_idComboBox = new javax.swing.JComboBox();
        update_searchButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        update_incomeTable = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        update_responsibleComboBox = new javax.swing.JComboBox();
        update_incomeAmountTextField = new javax.swing.JTextField();
        update_incomeReasonComboBox = new javax.swing.JComboBox();
        update_donatorNameComboBox = new javax.swing.JComboBox();
        update_incomeIdLabel = new javax.swing.JLabel();
        update_addDonatorButton = new javax.swing.JButton();
        update_addReasonButton = new javax.swing.JButton();
        update_addResponsibleButton = new javax.swing.JButton();
        update_incomeButton = new javax.swing.JButton();
        update_printIncomeButton = new javax.swing.JButton();
        update_incomeDateCalendarCombo = new org.freixas.jcalendar.JCalendar();
        update_idCheckBox = new javax.swing.JCheckBox();
        jPanel10 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        delete_dateCheckBox = new javax.swing.JCheckBox();
        delete_rangeOfDatesCheckBox = new javax.swing.JCheckBox();
        delete_reasonCheckBox = new javax.swing.JCheckBox();
        delete_donatorCheckBox = new javax.swing.JCheckBox();
        delete_takerCheckBox = new javax.swing.JCheckBox();
        delete_amountCheckBox = new javax.swing.JCheckBox();
        delete_moreThanAmountCheckBox = new javax.swing.JCheckBox();
        delete_lessThanAmountCheckBox = new javax.swing.JCheckBox();
        jPanel11 = new javax.swing.JPanel();
        delete_date1Label = new javax.swing.JLabel();
        delete_date1CalendarCombo = new org.freixas.jcalendar.JCalendarCombo();
        delete_date2Label = new javax.swing.JLabel();
        delete_date2CalendarCombo = new org.freixas.jcalendar.JCalendarCombo();
        delete_reasonLabel = new javax.swing.JLabel();
        delete_reasonComboBox = new javax.swing.JComboBox();
        delete_donatorLabel = new javax.swing.JLabel();
        delete_donatorComboBox = new javax.swing.JComboBox();
        delete_takerLabel = new javax.swing.JLabel();
        delete_takerComboBox = new javax.swing.JComboBox();
        delete_amountLabel = new javax.swing.JLabel();
        delete_amountTextField = new javax.swing.JTextField();
        delete_idLabel = new javax.swing.JLabel();
        delete_idComboBox = new javax.swing.JComboBox();
        delete_searchButton = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        delete_incomeTable = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        delete_incomeIdLabel = new javax.swing.JLabel();
        delete_incomeButton = new javax.swing.JButton();
        delete_donatorNameLabel = new javax.swing.JLabel();
        delete_incomeReasonLabel = new javax.swing.JLabel();
        delete_incomeAmountLabel = new javax.swing.JLabel();
        delete_incomeDateLabel = new javax.swing.JLabel();
        delete_responsibleLabel = new javax.swing.JLabel();
        delete_idCheckBox = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        manageIncomeTabbedPane.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N

        jLabel1.setText("Donator name :");

        jLabel2.setText("Reason for donation :");

        jLabel3.setText("Amount :");

        jLabel4.setText("Date :");

        jLabel5.setText("Responsible :");

        add_saveAndPrintButton.setText("Save and print");
        add_saveAndPrintButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_saveAndPrintButtonActionPerformed(evt);
            }
        });

        add_saveButton.setText("Save");
        add_saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_saveButtonActionPerformed(evt);
            }
        });

        add_donatorButton.setText("Add new donator");
        add_donatorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_donatorButtonActionPerformed(evt);
            }
        });

        add_reasonButton.setText("Add new reason for donation");
        add_reasonButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_reasonButtonActionPerformed(evt);
            }
        });

        add_responsibleButton.setText("Add new responsible");
        add_responsibleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_responsibleButtonActionPerformed(evt);
            }
        });

        jLabel13.setText("Donation Id :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(69, 69, 69)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(add_responsibleComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(add_dateCalendar, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(add_amountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(add_donationReasonComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel13))
                        .addGap(99, 99, 99)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(add_donatorComboBox, 0, 315, Short.MAX_VALUE)
                            .addComponent(add_incomeIdLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(add_donatorButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(add_reasonButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(add_responsibleButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(add_saveButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(add_saveAndPrintButton, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(1463, 1463, 1463))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(add_incomeIdLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(add_donatorComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add_donatorButton))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(add_donationReasonComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add_reasonButton))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(add_amountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(add_dateCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add_responsibleComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(add_responsibleButton))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add_saveAndPrintButton)
                    .addComponent(add_saveButton))
                .addContainerGap(207, Short.MAX_VALUE))
        );

        manageIncomeTabbedPane.addTab("Add New Income Detail", jPanel1);

        jLabel6.setText("Search income from :");

        search_dateCheckBox.setText("Date");
        search_dateCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_dateCheckBoxActionPerformed(evt);
            }
        });

        search_rangeOfDatesCheckBox.setText("Range of dates");
        search_rangeOfDatesCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_rangeOfDatesCheckBoxActionPerformed(evt);
            }
        });

        search_reasonCheckBox.setText("Reason");
        search_reasonCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_reasonCheckBoxActionPerformed(evt);
            }
        });

        search_donatorCheckBox.setText("Donator name");
        search_donatorCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_donatorCheckBoxActionPerformed(evt);
            }
        });

        search_takerCheckBox.setText("Donation taker");
        search_takerCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_takerCheckBoxActionPerformed(evt);
            }
        });

        search_amountCheckBox.setText("Amount");
        search_amountCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_amountCheckBoxActionPerformed(evt);
            }
        });

        search_moreThanAmountCheckBox.setText("More than given amount");
        search_moreThanAmountCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_moreThanAmountCheckBoxActionPerformed(evt);
            }
        });

        search_lessThanAmountCheckBox.setText("Less than given amount");
        search_lessThanAmountCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_lessThanAmountCheckBoxActionPerformed(evt);
            }
        });

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        search_date1Label.setText("Date 1:");

        search_date2Label.setText("Date 2 :");

        search_reasonLabel.setText("Reason :");

        search_donatorLabel.setText("Donator name :");

        search_takerLabel.setText("Donation taker :");

        search_amountLabel.setText("Amount :");

        search_idLabel.setText("Income id :");

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/print.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        search_searchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search.png"))); // NOI18N
        search_searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_searchButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(search_date1Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(search_date1CalendarCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(search_date2Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(search_date2CalendarCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(search_donatorLabel)
                    .addComponent(search_reasonLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(search_reasonComboBox, 0, 265, Short.MAX_VALUE)
                    .addComponent(search_donatorComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(search_takerLabel)
                    .addComponent(search_idLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(search_takerComboBox, 0, 201, Short.MAX_VALUE)
                    .addComponent(search_idComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(search_amountLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(search_amountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(search_searchButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(search_amountLabel)
                        .addComponent(search_amountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(search_date1Label)
                        .addComponent(search_date1CalendarCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(search_reasonLabel)
                        .addComponent(search_reasonComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(search_takerLabel)
                        .addComponent(search_takerComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(search_date2Label)
                    .addComponent(search_date2CalendarCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search_donatorLabel)
                    .addComponent(search_donatorComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search_idLabel)
                    .addComponent(search_idComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(search_searchButton)
                    .addComponent(jButton6))
                .addContainerGap())
        );

        search_incomeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Income id", "Donator name", "Reason for donation", "Amount", "Date", "Responsible"
            }
        ));
        jScrollPane1.setViewportView(search_incomeTable);

        search_idCheckBox.setText("Income id");
        search_idCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_idCheckBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(search_dateCheckBox)
                        .addGap(18, 18, 18)
                        .addComponent(search_rangeOfDatesCheckBox)
                        .addGap(18, 18, 18)
                        .addComponent(search_reasonCheckBox)
                        .addGap(18, 18, 18)
                        .addComponent(search_donatorCheckBox)
                        .addGap(18, 18, 18)
                        .addComponent(search_takerCheckBox)
                        .addGap(18, 18, 18)
                        .addComponent(search_amountCheckBox)
                        .addGap(18, 18, 18)
                        .addComponent(search_moreThanAmountCheckBox)
                        .addGap(18, 18, 18)
                        .addComponent(search_lessThanAmountCheckBox)
                        .addGap(18, 18, 18)
                        .addComponent(search_idCheckBox))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap(903, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(search_dateCheckBox)
                    .addComponent(search_rangeOfDatesCheckBox)
                    .addComponent(search_reasonCheckBox)
                    .addComponent(search_donatorCheckBox)
                    .addComponent(search_takerCheckBox)
                    .addComponent(search_amountCheckBox)
                    .addComponent(search_moreThanAmountCheckBox)
                    .addComponent(search_lessThanAmountCheckBox)
                    .addComponent(search_idCheckBox))
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
        );

        manageIncomeTabbedPane.addTab("Search Income Detail", jPanel2);

        jLabel21.setText("Search income from :");

        update_dateCheckBox.setText("Date");
        update_dateCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_dateCheckBoxActionPerformed(evt);
            }
        });

        update_rangeOfDatesCheckBox.setText("Range of dates");
        update_rangeOfDatesCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_rangeOfDatesCheckBoxActionPerformed(evt);
            }
        });

        update_reasonCheckBox.setText("Reason");
        update_reasonCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_reasonCheckBoxActionPerformed(evt);
            }
        });

        update_donatorCheckBox.setText("Donator name");
        update_donatorCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_donatorCheckBoxActionPerformed(evt);
            }
        });

        update_takerCheckBox.setText("Donation taker");
        update_takerCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_takerCheckBoxActionPerformed(evt);
            }
        });

        update_amountCheckBox.setText("Amount");
        update_amountCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_amountCheckBoxActionPerformed(evt);
            }
        });

        update_moreThanAmountCheckBox.setText("More than given amount");
        update_moreThanAmountCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_moreThanAmountCheckBoxActionPerformed(evt);
            }
        });

        update_lessThanAmountCheckBox.setText("Less than given amount");
        update_lessThanAmountCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_lessThanAmountCheckBoxActionPerformed(evt);
            }
        });

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        update_date1Label.setText("Date 1:");

        update_date2Label.setText("Date 2 :");

        update_reasonLabel.setText("Reason :");

        update_donatorLabel.setText("Donator name :");

        update_takerLabel.setText("Donation taker :");

        update_amountLabel.setText("Amount :");

        update_idLabel.setText("Income id :");

        update_searchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search.png"))); // NOI18N
        update_searchButton.setText("Search");
        update_searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_searchButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(update_date1Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(update_date1CalendarCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(update_date2Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(update_date2CalendarCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(update_donatorLabel)
                    .addComponent(update_reasonLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(update_reasonComboBox, 0, 265, Short.MAX_VALUE)
                    .addComponent(update_donatorComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(update_takerLabel)
                    .addComponent(update_idLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(update_takerComboBox, 0, 201, Short.MAX_VALUE)
                    .addComponent(update_idComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(update_amountLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(update_amountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(update_searchButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(update_date1Label)
                    .addComponent(update_date1CalendarCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(update_reasonLabel)
                    .addComponent(update_reasonComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(update_takerLabel)
                    .addComponent(update_takerComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(update_amountLabel)
                    .addComponent(update_amountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(update_date2Label)
                    .addComponent(update_date2CalendarCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(update_donatorLabel)
                    .addComponent(update_donatorComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(update_idLabel)
                    .addComponent(update_idComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(update_searchButton)
                .addContainerGap())
        );

        update_incomeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Income id", "Donator name", "Reason for donation", "Amount", "Date", "Responsible"
            }
        ));
        update_incomeTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                update_incomeTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(update_incomeTable);
        if (update_incomeTable.getColumnModel().getColumnCount() > 0) {
            update_incomeTable.getColumnModel().getColumn(0).setResizable(false);
        }

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel15.setText("Donation id :");

        jLabel16.setText("Donator name :");

        jLabel17.setText("Reason for donation :");

        jLabel18.setText("Amount :");

        jLabel19.setText("Date :");

        jLabel27.setText("Responsible :");

        update_addDonatorButton.setText("Add new donator");
        update_addDonatorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_addDonatorButtonActionPerformed(evt);
            }
        });

        update_addReasonButton.setText("Add new reason for donation");
        update_addReasonButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_addReasonButtonActionPerformed(evt);
            }
        });

        update_addResponsibleButton.setText("Add new responsible");
        update_addResponsibleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_addResponsibleButtonActionPerformed(evt);
            }
        });

        update_incomeButton.setText("Update");
        update_incomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_incomeButtonActionPerformed(evt);
            }
        });

        update_printIncomeButton.setText("Update and print");
        update_printIncomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_printIncomeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(update_incomeButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(update_printIncomeButton))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel15))
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(update_donatorNameComboBox, 0, 315, Short.MAX_VALUE)
                                    .addComponent(update_incomeIdLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel19))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(update_incomeReasonComboBox, 0, 315, Short.MAX_VALUE)
                                    .addComponent(update_incomeAmountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(update_responsibleComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(update_incomeDateCalendarCombo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE))))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel27)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(update_addReasonButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(update_addDonatorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(update_addResponsibleButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(update_incomeIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(update_donatorNameComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(update_addDonatorButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(update_incomeReasonComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(update_addReasonButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(update_incomeAmountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(update_incomeDateCalendarCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(update_responsibleComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27)
                    .addComponent(update_addResponsibleButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(update_printIncomeButton)
                    .addComponent(update_incomeButton))
                .addGap(52, 52, 52))
        );

        update_idCheckBox.setText("Income id");
        update_idCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_idCheckBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addGap(18, 18, 18)
                        .addComponent(update_dateCheckBox)
                        .addGap(18, 18, 18)
                        .addComponent(update_rangeOfDatesCheckBox)
                        .addGap(18, 18, 18)
                        .addComponent(update_reasonCheckBox)
                        .addGap(18, 18, 18)
                        .addComponent(update_donatorCheckBox)
                        .addGap(18, 18, 18)
                        .addComponent(update_takerCheckBox)
                        .addGap(18, 18, 18)
                        .addComponent(update_amountCheckBox)
                        .addGap(18, 18, 18)
                        .addComponent(update_moreThanAmountCheckBox)
                        .addGap(18, 18, 18)
                        .addComponent(update_lessThanAmountCheckBox)
                        .addGap(18, 18, 18)
                        .addComponent(update_idCheckBox))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(824, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(update_dateCheckBox)
                    .addComponent(update_rangeOfDatesCheckBox)
                    .addComponent(update_reasonCheckBox)
                    .addComponent(update_donatorCheckBox)
                    .addComponent(update_takerCheckBox)
                    .addComponent(update_amountCheckBox)
                    .addComponent(update_moreThanAmountCheckBox)
                    .addComponent(update_lessThanAmountCheckBox)
                    .addComponent(update_idCheckBox))
                .addGap(18, 18, 18)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(78, Short.MAX_VALUE))
        );

        manageIncomeTabbedPane.addTab("Update Existing Income Detail", jPanel8);

        jLabel29.setText("Search income from :");

        delete_dateCheckBox.setText("Date");
        delete_dateCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_dateCheckBoxActionPerformed(evt);
            }
        });

        delete_rangeOfDatesCheckBox.setText("Range of dates");
        delete_rangeOfDatesCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_rangeOfDatesCheckBoxActionPerformed(evt);
            }
        });

        delete_reasonCheckBox.setText("Reason");
        delete_reasonCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_reasonCheckBoxActionPerformed(evt);
            }
        });

        delete_donatorCheckBox.setText("Donator name");
        delete_donatorCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_donatorCheckBoxActionPerformed(evt);
            }
        });

        delete_takerCheckBox.setText("Donation taker");
        delete_takerCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_takerCheckBoxActionPerformed(evt);
            }
        });

        delete_amountCheckBox.setText("Amount");
        delete_amountCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_amountCheckBoxActionPerformed(evt);
            }
        });

        delete_moreThanAmountCheckBox.setText("More than given amount");
        delete_moreThanAmountCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_moreThanAmountCheckBoxActionPerformed(evt);
            }
        });

        delete_lessThanAmountCheckBox.setText("Less than given amount");
        delete_lessThanAmountCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_lessThanAmountCheckBoxActionPerformed(evt);
            }
        });

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        delete_date1Label.setText("Date 1:");

        delete_date2Label.setText("Date 2 :");

        delete_reasonLabel.setText("Reason :");

        delete_donatorLabel.setText("Donator name :");

        delete_takerLabel.setText("Donation taker :");

        delete_amountLabel.setText("Amount :");

        delete_idLabel.setText("Income id :");

        delete_searchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search.png"))); // NOI18N
        delete_searchButton.setText("Search");
        delete_searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_searchButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(delete_date1Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(delete_date1CalendarCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(delete_date2Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(delete_date2CalendarCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(delete_donatorLabel)
                    .addComponent(delete_reasonLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(delete_reasonComboBox, 0, 265, Short.MAX_VALUE)
                    .addComponent(delete_donatorComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(delete_takerLabel)
                    .addComponent(delete_idLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(delete_takerComboBox, 0, 201, Short.MAX_VALUE)
                    .addComponent(delete_idComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(delete_amountLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(delete_amountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(delete_searchButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(delete_date1Label)
                    .addComponent(delete_date1CalendarCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete_reasonLabel)
                    .addComponent(delete_reasonComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete_takerLabel)
                    .addComponent(delete_takerComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete_amountLabel)
                    .addComponent(delete_amountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(delete_date2Label)
                    .addComponent(delete_date2CalendarCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete_donatorLabel)
                    .addComponent(delete_donatorComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete_idLabel)
                    .addComponent(delete_idComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(delete_searchButton)
                .addContainerGap())
        );

        delete_incomeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Income id", "Donator name", "Reason for donation", "Amount", "Date", "Responsible"
            }
        ));
        delete_incomeTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delete_incomeTableMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(delete_incomeTable);

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel47.setText("Donation id :");

        jLabel48.setText("Donator name :");

        jLabel49.setText("Reason for donation :");

        jLabel50.setText("Amount :");

        jLabel51.setText("Date :");

        jLabel52.setText("Responsible :");

        delete_incomeButton.setText("Delete");
        delete_incomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_incomeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(delete_incomeButton)
                        .addGap(134, 134, 134))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel48)
                            .addComponent(jLabel47)
                            .addComponent(jLabel49)
                            .addComponent(jLabel50)
                            .addComponent(jLabel51)
                            .addComponent(jLabel52))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(delete_incomeIdLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(delete_incomeAmountLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(delete_incomeDateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(delete_donatorNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(delete_incomeReasonLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(delete_responsibleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(61, 61, 61))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(delete_incomeIdLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(delete_donatorNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(delete_incomeReasonLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel50, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(delete_incomeAmountLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(delete_incomeDateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel52, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(delete_responsibleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(delete_incomeButton)
                .addContainerGap(138, Short.MAX_VALUE))
        );

        delete_idCheckBox.setText("Income id");
        delete_idCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_idCheckBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel29)
                        .addGap(18, 18, 18)
                        .addComponent(delete_dateCheckBox)
                        .addGap(18, 18, 18)
                        .addComponent(delete_rangeOfDatesCheckBox)
                        .addGap(18, 18, 18)
                        .addComponent(delete_reasonCheckBox)
                        .addGap(18, 18, 18)
                        .addComponent(delete_donatorCheckBox)
                        .addGap(18, 18, 18)
                        .addComponent(delete_takerCheckBox)
                        .addGap(18, 18, 18)
                        .addComponent(delete_amountCheckBox)
                        .addGap(18, 18, 18)
                        .addComponent(delete_moreThanAmountCheckBox)
                        .addGap(18, 18, 18)
                        .addComponent(delete_lessThanAmountCheckBox)
                        .addGap(18, 18, 18)
                        .addComponent(delete_idCheckBox))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(824, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(delete_dateCheckBox)
                    .addComponent(delete_rangeOfDatesCheckBox)
                    .addComponent(delete_reasonCheckBox)
                    .addComponent(delete_donatorCheckBox)
                    .addComponent(delete_takerCheckBox)
                    .addComponent(delete_amountCheckBox)
                    .addComponent(delete_moreThanAmountCheckBox)
                    .addComponent(delete_lessThanAmountCheckBox)
                    .addComponent(delete_idCheckBox))
                .addGap(18, 18, 18)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(121, Short.MAX_VALUE))
        );

        manageIncomeTabbedPane.addTab("Delete Existing Income Detail", jPanel10);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(manageIncomeTabbedPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(manageIncomeTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 669, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 255, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void add_donatorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_donatorButtonActionPerformed
        try {
            NewDonator newDonator = new NewDonator(this, rootPaneCheckingEnabled);
            newDonator.setLocationRelativeTo(null);
            newDonator.setVisible(true);

            if (!newDonator.isVisible()) {
                loadComboInAddIncomeTab();
                loadComboInSearchIncomeTab();
                loadComboInUpdateIncomeTab();
                loadComboInDeleteIncomeTab();
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ManageExpenditure.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_add_donatorButtonActionPerformed

    private void add_reasonButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_reasonButtonActionPerformed
        try {
            NewIncomeReason newIncomeReason = new NewIncomeReason(this, rootPaneCheckingEnabled);
            newIncomeReason.setLocationRelativeTo(null);
            newIncomeReason.setVisible(true);

            if (!newIncomeReason.isVisible()) {
                loadComboInAddIncomeTab();
                loadComboInSearchIncomeTab();
                loadComboInUpdateIncomeTab();
                loadComboInDeleteIncomeTab();
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ManageExpenditure.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_add_reasonButtonActionPerformed

    private void add_responsibleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_responsibleButtonActionPerformed
        try {
            NewResponsible newResponsible = new NewResponsible(this, rootPaneCheckingEnabled);
            newResponsible.setLocationRelativeTo(null);
            newResponsible.setVisible(true);

            if (!newResponsible.isVisible()) {
                loadComboInAddIncomeTab();
                loadComboInSearchIncomeTab();
                loadComboInUpdateIncomeTab();
                loadComboInDeleteIncomeTab();
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ManageExpenditure.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_add_responsibleButtonActionPerformed

    private void add_saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_saveButtonActionPerformed
        try {
            if (add_donatorComboBox.getSelectedItem() != null
                    && add_donationReasonComboBox.getSelectedItem() != null
                    && !add_amountTextField.getText().isEmpty()
                    && add_responsibleComboBox.getSelectedItem() != null) {

                String income_id = add_incomeIdLabel.getText();

                String donator_name = (String) add_donatorComboBox.getSelectedItem();
                object = donatorController.searchDonator("donator_name", donator_name);
                String donator_id = (String) object[0];

                String incomeReason_title = (String) add_donationReasonComboBox.getSelectedItem();
                object = incomeReasonController.searchIncomeReason("incomeReason_title", incomeReason_title);
                String incomeReason_id = (String) object[0];

                double income_amount = Double.parseDouble(add_amountTextField.getText());

                String income_date = simpleDateFormat.format(add_dateCalendar.getDate());

                String responsible_name = (String) add_responsibleComboBox.getSelectedItem();
                object = responsibleController.searchResponsible("responsible_name", responsible_name);
                String responsible_id = (String) object[0];

                int result = incomeController.addIncome(income_id, donator_id, incomeReason_id, income_amount, income_date, responsible_id);

                if (result == 1) {
                    JOptionPane.showMessageDialog(rootPane, "Income saved successfully.");

                    add_incomeIdLabel.setText(idGenerator.generateId("ii"));
                    add_amountTextField.setText(null);

                    loadComboInAddIncomeTab();
                    loadComboInSearchIncomeTab();
                    loadComboInUpdateIncomeTab();
                    loadComboInDeleteIncomeTab();
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Income saving failed. Please retry saving with corrrect details.");
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "None of the fields cannot be null. Please recheck before you save income.");
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ManageIncome.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_add_saveButtonActionPerformed

    private void add_saveAndPrintButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_saveAndPrintButtonActionPerformed
        add_saveButton.doClick();
    }//GEN-LAST:event_add_saveAndPrintButtonActionPerformed

    private void search_searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_searchButtonActionPerformed
        try {
            if (search_dateCheckBox.isSelected() || search_rangeOfDatesCheckBox.isSelected()
                    || search_reasonCheckBox.isSelected() || search_donatorCheckBox.isSelected()
                    || search_takerCheckBox.isSelected() || search_amountCheckBox.isSelected()
                    || search_moreThanAmountCheckBox.isSelected() || search_lessThanAmountCheckBox.isSelected()
                    || search_idCheckBox.isSelected()) {
                String query = "SELECT * FROM income ";
                if (search_idCheckBox.isSelected()) {
                    String income_id = search_idComboBox.getSelectedItem() + "";
                    query += "WHERE income_id = '" + income_id + "' ";

                } else {
                    query += "WHERE ";
                    boolean useAnd = false;

                    if (search_dateCheckBox.isSelected()) {
                        String expenditure_date = simpleDateFormat.format(search_date1CalendarCombo.getDate());
                        query += "income_date ='" + expenditure_date + "' ";
                        useAnd = true;

                    } else if (search_rangeOfDatesCheckBox.isSelected()) {
                        String date1 = simpleDateFormat.format(search_date1CalendarCombo.getDate());
                        String date2 = simpleDateFormat.format(search_date2CalendarCombo.getDate());

                        query += "income_date BETWEEN '" + date1 + "' AND '" + date2 + "' ";
                        useAnd = true;
                    }

                    if (search_donatorCheckBox.isSelected()) {
                        String donator_name = (String) search_donatorComboBox.getSelectedItem();
                        object = donatorController.searchDonator("donator_name", donator_name);
                        String donator_id = (String) object[0];
                        if (useAnd) {
                            query += "AND donator_id = '" + donator_id + "' ";
                        } else {
                            query += "donator_id = '" + donator_id + "' ";
                        }
                        useAnd = true;
                    }

                    if (search_reasonCheckBox.isSelected()) {
                        String income_reason = search_reasonComboBox.getSelectedItem() + "";
                        object = incomeReasonController.searchIncomeReason("incomeReason_title", income_reason);
                        String incomeReason_id = (String) object[0];

                        if (useAnd) {
                            query += "AND incomeReason_id ='" + incomeReason_id + "' ";
                        } else {
                            query += "incomeReason_id ='" + incomeReason_id + "' ";
                        }
                        useAnd = true;
                    }

                    if (search_takerCheckBox.isSelected()) {
                        String responsible_name = search_takerComboBox.getSelectedItem() + "";
                        object = responsibleController.searchResponsible("responsible_name", responsible_name);
                        String responsible_id = (String) object[0];

                        if (useAnd) {
                            query += "AND responsible_id ='" + responsible_id + "' ";
                        } else {
                            query += "responsible_id ='" + responsible_id + "' ";
                        }
                        useAnd = true;
                    }

                    if (search_amountCheckBox.isSelected()) {
                        double income_amount = Double.parseDouble(search_amountTextField.getText());

                        if (useAnd) {
                            query += "AND income_amount ='" + income_amount + "' ";
                        } else {
                            query += "income_amount ='" + income_amount + "' ";
                        }
                    } else if (search_moreThanAmountCheckBox.isSelected()) {
                        double income_amount = Double.parseDouble(search_amountTextField.getText());

                        if (useAnd) {
                            query += "AND income_amount >'" + income_amount + "' ";
                        } else {
                            query += "income_amount >'" + income_amount + "' ";
                        }
                    } else if (search_lessThanAmountCheckBox.isSelected()) {
                        double income_amount = Double.parseDouble(search_amountTextField.getText());

                        if (useAnd) {
                            query += "AND income_amount <'" + income_amount + "' ";
                        } else {
                            query += "income_amount <'" + income_amount + "' ";
                        }
                    }
                }

                ArrayList<Object[]> arrayList = incomeController.searchAllIncome(query);
                dtmForSearch.setRowCount(0);

                for (int i = 0; i < arrayList.size(); i++) {
                    Object[] objectToFillTable = new Object[6];

                    objectToFillTable[0] = arrayList.get(i)[0];

                    object = donatorController.searchDonator("donator_id", (String) arrayList.get(i)[1]);
                    objectToFillTable[1] = object[1];

                    object = incomeReasonController.searchIncomeReason("incomeReason_id", (String) arrayList.get(i)[2]);
                    objectToFillTable[2] = object[1];

                    objectToFillTable[3] = arrayList.get(i)[5];
                    objectToFillTable[4] = arrayList.get(i)[4];

                    object = responsibleController.searchResponsible("responsible_id", (String) arrayList.get(i)[3]);
                    objectToFillTable[5] = object[1];

                    dtmForSearch.addRow(objectToFillTable);
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Please select at least one filter to search income data");
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ManageExpenditure.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_search_searchButtonActionPerformed

    private void search_dateCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_dateCheckBoxActionPerformed
        search_idCheckBox.setSelected(false);
        search_rangeOfDatesCheckBox.setSelected(false);

        search_date1Label.setEnabled(true);
        search_date1CalendarCombo.setEnabled(true);

        search_date2Label.setEnabled(false);
        search_date2CalendarCombo.setEnabled(false);

        if (!search_dateCheckBox.isSelected()) {
            search_date1Label.setEnabled(false);
            search_date1CalendarCombo.setEnabled(false);
        }
    }//GEN-LAST:event_search_dateCheckBoxActionPerformed

    private void search_rangeOfDatesCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_rangeOfDatesCheckBoxActionPerformed
        search_idCheckBox.setSelected(false);
        search_dateCheckBox.setSelected(false);

        search_date1Label.setEnabled(true);
        search_date1CalendarCombo.setEnabled(true);

        search_date2Label.setEnabled(true);
        search_date2CalendarCombo.setEnabled(true);

        if (!search_rangeOfDatesCheckBox.isSelected()) {
            search_date1Label.setEnabled(false);
            search_date1CalendarCombo.setEnabled(false);

            search_date2Label.setEnabled(false);
            search_date2CalendarCombo.setEnabled(false);
        }
    }//GEN-LAST:event_search_rangeOfDatesCheckBoxActionPerformed

    private void search_reasonCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_reasonCheckBoxActionPerformed
        search_idCheckBox.setSelected(false);
        search_reasonLabel.setEnabled(true);
        search_reasonComboBox.setEnabled(true);

        if (!search_reasonCheckBox.isSelected()) {
            search_reasonLabel.setEnabled(false);
            search_reasonComboBox.setEnabled(false);
        }
    }//GEN-LAST:event_search_reasonCheckBoxActionPerformed

    private void search_donatorCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_donatorCheckBoxActionPerformed
        search_idCheckBox.setSelected(false);

        search_donatorLabel.setEnabled(true);
        search_donatorComboBox.setEnabled(true);

        if (!search_takerCheckBox.isSelected()) {
            search_donatorLabel.setEnabled(false);
            search_donatorComboBox.setEnabled(false);
        }
    }//GEN-LAST:event_search_donatorCheckBoxActionPerformed

    private void search_takerCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_takerCheckBoxActionPerformed
        search_idCheckBox.setSelected(false);
        search_takerLabel.setEnabled(true);
        search_takerComboBox.setEnabled(true);

        if (!search_takerCheckBox.isSelected()) {
            search_takerLabel.setEnabled(false);
            search_takerComboBox.setEnabled(false);
        }
    }//GEN-LAST:event_search_takerCheckBoxActionPerformed

    private void search_amountCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_amountCheckBoxActionPerformed
        search_idCheckBox.setSelected(false);
        search_moreThanAmountCheckBox.setSelected(false);
        search_lessThanAmountCheckBox.setSelected(false);
        search_takerLabel.setEnabled(true);
        search_takerComboBox.setEnabled(true);

        if (!search_takerCheckBox.isSelected()) {
            search_takerLabel.setEnabled(false);
            search_takerComboBox.setEnabled(false);
        }
    }//GEN-LAST:event_search_amountCheckBoxActionPerformed

    private void search_moreThanAmountCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_moreThanAmountCheckBoxActionPerformed
        search_idCheckBox.setSelected(false);
        search_amountCheckBox.setSelected(false);
        search_lessThanAmountCheckBox.setSelected(false);

        search_amountLabel.setEnabled(true);
        search_amountTextField.setEnabled(true);

        if (!search_moreThanAmountCheckBox.isSelected()) {
            search_amountLabel.setEnabled(false);
            search_amountTextField.setEnabled(false);
        }
    }//GEN-LAST:event_search_moreThanAmountCheckBoxActionPerformed

    private void search_lessThanAmountCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_lessThanAmountCheckBoxActionPerformed
        search_idCheckBox.setSelected(false);
        search_amountCheckBox.setSelected(false);
        search_moreThanAmountCheckBox.setSelected(false);

        search_amountLabel.setEnabled(true);
        search_amountTextField.setEnabled(true);

        if (!search_lessThanAmountCheckBox.isSelected()) {
            search_amountLabel.setEnabled(false);
            search_amountTextField.setEnabled(false);
        }
    }//GEN-LAST:event_search_lessThanAmountCheckBoxActionPerformed

    private void search_idCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_idCheckBoxActionPerformed
        search_dateCheckBox.setSelected(false);
        search_rangeOfDatesCheckBox.setSelected(false);
        search_reasonCheckBox.setSelected(false);
        search_donatorCheckBox.setSelected(false);
        search_takerCheckBox.setSelected(false);
        search_amountCheckBox.setSelected(false);
        search_moreThanAmountCheckBox.setSelected(false);
        search_lessThanAmountCheckBox.setSelected(false);

        search_date1CalendarCombo.setEnabled(false);
        search_date2CalendarCombo.setEnabled(false);
        search_reasonComboBox.setEnabled(false);
        search_donatorComboBox.setEnabled(false);
        search_takerComboBox.setEnabled(false);
        search_amountTextField.setEnabled(false);
        search_date1Label.setEnabled(false);
        search_date2Label.setEnabled(false);
        search_reasonLabel.setEnabled(false);
        search_donatorLabel.setEnabled(false);
        search_takerLabel.setEnabled(false);
        search_amountLabel.setEnabled(false);

        search_idLabel.setEnabled(true);
        search_idComboBox.setEnabled(true);

        if (!search_idCheckBox.isSelected()) {
            search_idLabel.setEnabled(false);
            search_idComboBox.setEnabled(false);
        }
    }//GEN-LAST:event_search_idCheckBoxActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void update_dateCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_dateCheckBoxActionPerformed
        update_idCheckBox.setSelected(false);
        update_rangeOfDatesCheckBox.setSelected(false);

        update_date1Label.setEnabled(true);
        update_date1CalendarCombo.setEnabled(true);

        update_date2Label.setEnabled(false);
        update_date2CalendarCombo.setEnabled(false);

        update_idLabel.setEnabled(false);
        update_idComboBox.setEnabled(false);

        if (!update_dateCheckBox.isSelected()) {
            update_date1Label.setEnabled(false);
            update_date1CalendarCombo.setEnabled(false);
        }
    }//GEN-LAST:event_update_dateCheckBoxActionPerformed

    private void update_rangeOfDatesCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_rangeOfDatesCheckBoxActionPerformed
        update_idCheckBox.setSelected(false);
        update_dateCheckBox.setSelected(false);

        update_date1Label.setEnabled(true);
        update_date1CalendarCombo.setEnabled(true);

        update_date2Label.setEnabled(true);
        update_date2CalendarCombo.setEnabled(true);

        update_idLabel.setEnabled(false);
        update_idComboBox.setEnabled(false);

        if (!update_rangeOfDatesCheckBox.isSelected()) {
            update_date1Label.setEnabled(false);
            update_date1CalendarCombo.setEnabled(false);

            update_date2Label.setEnabled(false);
            update_date2CalendarCombo.setEnabled(false);
        }
    }//GEN-LAST:event_update_rangeOfDatesCheckBoxActionPerformed

    private void update_reasonCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_reasonCheckBoxActionPerformed
        update_idCheckBox.setSelected(false);
        update_reasonLabel.setEnabled(true);
        update_reasonComboBox.setEnabled(true);

        update_idLabel.setEnabled(false);
        update_idComboBox.setEnabled(false);

        if (!update_reasonCheckBox.isSelected()) {
            update_reasonLabel.setEnabled(false);
            update_reasonComboBox.setEnabled(false);
        }
    }//GEN-LAST:event_update_reasonCheckBoxActionPerformed

    private void update_donatorCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_donatorCheckBoxActionPerformed
        update_idCheckBox.setSelected(false);

        update_donatorLabel.setEnabled(true);
        update_donatorComboBox.setEnabled(true);

        update_idLabel.setEnabled(false);
        update_idComboBox.setEnabled(false);

        if (!update_takerCheckBox.isSelected()) {
            update_donatorLabel.setEnabled(false);
            update_donatorComboBox.setEnabled(false);
        }
    }//GEN-LAST:event_update_donatorCheckBoxActionPerformed

    private void update_takerCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_takerCheckBoxActionPerformed
        update_idCheckBox.setSelected(false);
        update_takerLabel.setEnabled(true);
        update_takerComboBox.setEnabled(true);

        update_idLabel.setEnabled(false);
        update_idComboBox.setEnabled(false);

        if (!update_takerCheckBox.isSelected()) {
            update_takerLabel.setEnabled(false);
            update_takerComboBox.setEnabled(false);
        }
    }//GEN-LAST:event_update_takerCheckBoxActionPerformed

    private void update_amountCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_amountCheckBoxActionPerformed
        update_idCheckBox.setSelected(false);
        update_moreThanAmountCheckBox.setSelected(false);
        update_lessThanAmountCheckBox.setSelected(false);
        update_takerLabel.setEnabled(true);
        update_takerComboBox.setEnabled(true);

        update_idLabel.setEnabled(false);
        update_idComboBox.setEnabled(false);

        if (!update_takerCheckBox.isSelected()) {
            update_takerLabel.setEnabled(false);
            update_takerComboBox.setEnabled(false);
        }
    }//GEN-LAST:event_update_amountCheckBoxActionPerformed

    private void update_moreThanAmountCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_moreThanAmountCheckBoxActionPerformed
        update_idCheckBox.setSelected(false);
        update_amountCheckBox.setSelected(false);
        update_lessThanAmountCheckBox.setSelected(false);

        update_amountLabel.setEnabled(true);
        update_amountTextField.setEnabled(true);

        update_idLabel.setEnabled(false);
        update_idComboBox.setEnabled(false);

        if (!update_moreThanAmountCheckBox.isSelected()) {
            update_amountLabel.setEnabled(false);
            update_amountTextField.setEnabled(false);
        }
    }//GEN-LAST:event_update_moreThanAmountCheckBoxActionPerformed

    private void update_lessThanAmountCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_lessThanAmountCheckBoxActionPerformed
        update_idCheckBox.setSelected(false);
        update_amountCheckBox.setSelected(false);
        update_moreThanAmountCheckBox.setSelected(false);

        update_amountLabel.setEnabled(true);
        update_amountTextField.setEnabled(true);

        update_idLabel.setEnabled(false);
        update_idComboBox.setEnabled(false);

        if (!update_lessThanAmountCheckBox.isSelected()) {
            update_amountLabel.setEnabled(false);
            update_amountTextField.setEnabled(false);
        }
    }//GEN-LAST:event_update_lessThanAmountCheckBoxActionPerformed

    private void update_idCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_idCheckBoxActionPerformed
        update_dateCheckBox.setSelected(false);
        update_rangeOfDatesCheckBox.setSelected(false);
        update_reasonCheckBox.setSelected(false);
        update_donatorCheckBox.setSelected(false);
        update_takerCheckBox.setSelected(false);
        update_amountCheckBox.setSelected(false);
        update_moreThanAmountCheckBox.setSelected(false);
        update_lessThanAmountCheckBox.setSelected(false);

        update_date1CalendarCombo.setEnabled(false);
        update_date2CalendarCombo.setEnabled(false);
        update_reasonComboBox.setEnabled(false);
        update_donatorComboBox.setEnabled(false);
        update_takerComboBox.setEnabled(false);
        update_amountTextField.setEnabled(false);
        update_date1Label.setEnabled(false);
        update_date2Label.setEnabled(false);
        update_reasonLabel.setEnabled(false);
        update_donatorLabel.setEnabled(false);
        update_takerLabel.setEnabled(false);
        update_amountLabel.setEnabled(false);

        update_idLabel.setEnabled(true);
        update_idComboBox.setEnabled(true);

        update_idLabel.setEnabled(false);
        update_idComboBox.setEnabled(false);

        if (!update_idCheckBox.isSelected()) {
            update_idLabel.setEnabled(false);
            update_idComboBox.setEnabled(false);
        }
    }//GEN-LAST:event_update_idCheckBoxActionPerformed

    private void update_searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_searchButtonActionPerformed
        try {
            if (update_dateCheckBox.isSelected() || update_dateCheckBox.isSelected()
                    || update_rangeOfDatesCheckBox.isSelected() || update_reasonCheckBox.isSelected()
                    || update_donatorCheckBox.isSelected() || update_takerCheckBox.isSelected()
                    || update_amountCheckBox.isSelected() || update_moreThanAmountCheckBox.isSelected()
                    || update_lessThanAmountCheckBox.isSelected() || update_idCheckBox.isSelected()) {
                String query = "SELECT * FROM income ";
                if (update_idCheckBox.isSelected()) {
                    String income_id = update_idComboBox.getSelectedItem() + "";
                    query += "WHERE income_id = '" + income_id + "' ";

                } else {
                    query += "WHERE ";
                    boolean useAnd = false;

                    if (update_dateCheckBox.isSelected()) {
                        String expenditure_date = simpleDateFormat.format(update_date1CalendarCombo.getDate());
                        query += "income_date ='" + expenditure_date + "' ";
                        useAnd = true;

                    } else if (update_rangeOfDatesCheckBox.isSelected()) {
                        String date1 = simpleDateFormat.format(update_date1CalendarCombo.getDate());
                        String date2 = simpleDateFormat.format(update_date2CalendarCombo.getDate());

                        query += "income_date BETWEEN '" + date1 + "' AND '" + date2 + "' ";
                        useAnd = true;
                    }

                    if (update_donatorCheckBox.isSelected()) {
                        String donator_name = (String) update_donatorComboBox.getSelectedItem();
                        object = donatorController.searchDonator("donator_name", donator_name);
                        String donator_id = (String) object[0];
                        if (useAnd) {
                            query += "AND donator_id = '" + donator_id + "' ";
                        } else {
                            query += "donator_id = '" + donator_id + "' ";
                        }
                        useAnd = true;
                    }

                    if (update_reasonCheckBox.isSelected()) {
                        String income_reason = update_reasonComboBox.getSelectedItem() + "";
                        object = incomeReasonController.searchIncomeReason("incomeReason_title", income_reason);
                        String incomeReason_id = (String) object[0];

                        if (useAnd) {
                            query += "AND incomeReason_id ='" + incomeReason_id + "' ";
                        } else {
                            query += "incomeReason_id ='" + incomeReason_id + "' ";
                        }
                        useAnd = true;
                    }

                    if (update_takerCheckBox.isSelected()) {
                        String responsible_name = update_takerComboBox.getSelectedItem() + "";
                        object = responsibleController.searchResponsible("responsible_name", responsible_name);
                        String responsible_id = (String) object[0];

                        if (useAnd) {
                            query += "AND responsible_id ='" + responsible_id + "' ";
                        } else {
                            query += "responsible_id ='" + responsible_id + "' ";
                        }
                        useAnd = true;
                    }

                    if (update_amountCheckBox.isSelected()) {
                        double income_amount = Double.parseDouble(update_amountTextField.getText());

                        if (useAnd) {
                            query += "AND income_amount ='" + income_amount + "' ";
                        } else {
                            query += "income_amount ='" + income_amount + "' ";
                        }
                    } else if (update_moreThanAmountCheckBox.isSelected()) {
                        double income_amount = Double.parseDouble(update_amountTextField.getText());

                        if (useAnd) {
                            query += "AND income_amount >'" + income_amount + "' ";
                        } else {
                            query += "income_amount >'" + income_amount + "' ";
                        }
                    } else if (update_lessThanAmountCheckBox.isSelected()) {
                        double income_amount = Double.parseDouble(update_amountTextField.getText());

                        if (useAnd) {
                            query += "AND income_amount <'" + income_amount + "' ";
                        } else {
                            query += "income_amount <'" + income_amount + "' ";
                        }
                    }
                }

                ArrayList<Object[]> arrayList = incomeController.searchAllIncome(query);
                dtmForUpdate.setRowCount(0);

                for (int i = 0; i < arrayList.size(); i++) {
                    Object[] objectToFillTable = new Object[6];

                    objectToFillTable[0] = arrayList.get(i)[0];

                    object = donatorController.searchDonator("donator_id", (String) arrayList.get(i)[1]);
                    objectToFillTable[1] = object[1];

                    object = incomeReasonController.searchIncomeReason("incomeReason_id", (String) arrayList.get(i)[2]);
                    objectToFillTable[2] = object[1];

                    objectToFillTable[3] = arrayList.get(i)[5];
                    objectToFillTable[4] = arrayList.get(i)[4];

                    object = responsibleController.searchResponsible("responsible_id", (String) arrayList.get(i)[3]);
                    objectToFillTable[5] = object[1];

                    dtmForUpdate.addRow(objectToFillTable);
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Please select at least one filter to search income data");
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ManageExpenditure.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_update_searchButtonActionPerformed

    private void update_incomeTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_update_incomeTableMouseClicked
        try {
            int selectedRow = update_incomeTable.getSelectedRow();

            update_incomeIdLabel.setText((String) dtmForUpdate.getValueAt(selectedRow, 0));
            update_donatorNameComboBox.setSelectedItem((String) dtmForUpdate.getValueAt(selectedRow, 1));
            update_incomeReasonComboBox.setSelectedItem((String) dtmForUpdate.getValueAt(selectedRow, 2));
            update_incomeAmountTextField.setText((String) dtmForUpdate.getValueAt(selectedRow, 3));

            Date date = simpleDateFormat.parse((String) dtmForUpdate.getValueAt(selectedRow, 4));

            update_incomeDateCalendarCombo.setDate(date);

            update_responsibleComboBox.setSelectedItem((String) dtmForUpdate.getValueAt(selectedRow, 5));
        } catch (ParseException ex) {
            Logger.getLogger(ManageExpenditure.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_update_incomeTableMouseClicked

    private void update_addDonatorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_addDonatorButtonActionPerformed
        try {
            NewDonator newDonator = new NewDonator(this, rootPaneCheckingEnabled);
            newDonator.setLocationRelativeTo(null);
            newDonator.setVisible(true);

            if (!newDonator.isVisible()) {
                loadComboInAddIncomeTab();
                loadComboInSearchIncomeTab();
                loadComboInUpdateIncomeTab();
                loadComboInDeleteIncomeTab();
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ManageExpenditure.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_update_addDonatorButtonActionPerformed

    private void update_addReasonButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_addReasonButtonActionPerformed
        try {
            NewIncomeReason newIncomeReason = new NewIncomeReason(this, rootPaneCheckingEnabled);
            newIncomeReason.setLocationRelativeTo(null);
            newIncomeReason.setVisible(true);

            if (!newIncomeReason.isVisible()) {
                loadComboInAddIncomeTab();
                loadComboInSearchIncomeTab();
                loadComboInUpdateIncomeTab();
                loadComboInDeleteIncomeTab();
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ManageExpenditure.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_update_addReasonButtonActionPerformed

    private void update_addResponsibleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_addResponsibleButtonActionPerformed
        try {
            NewResponsible newResponsible = new NewResponsible(this, rootPaneCheckingEnabled);
            newResponsible.setLocationRelativeTo(null);
            newResponsible.setVisible(true);

            if (!newResponsible.isVisible()) {
                loadComboInAddIncomeTab();
                loadComboInSearchIncomeTab();
                loadComboInUpdateIncomeTab();
                loadComboInDeleteIncomeTab();
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ManageExpenditure.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_update_addResponsibleButtonActionPerformed

    private void update_incomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_incomeButtonActionPerformed
        try {
            if (update_donatorNameComboBox.getSelectedItem() != null && update_incomeReasonComboBox.getSelectedItem() != null
                    && update_incomeAmountTextField.getText() != null && update_responsibleComboBox.getSelectedItem() != null) {
                String income_id = update_incomeIdLabel.getText();

                String donator_name = update_donatorNameComboBox.getSelectedItem() + "";
                object = donatorController.searchDonator("donator_name", donator_name);
                String donator_id = (String) object[0];

                String incomeReason_title = update_incomeReasonComboBox.getSelectedItem() + "";
                object = incomeReasonController.searchIncomeReason("incomeReason_title", incomeReason_title);
                String incomeReason_id = (String) object[0];

                double income_amount = Double.parseDouble(update_incomeAmountTextField.getText());
                String income_date = simpleDateFormat.format(update_incomeDateCalendarCombo.getDate());

                String responsible_name = update_responsibleComboBox.getSelectedItem() + "";
                object = responsibleController.searchResponsible("responsible_name", responsible_name);
                String responsible_id = (String) object[0];

                int result = incomeController.updateIncome(income_id, donator_id, incomeReason_id, income_amount, income_date, responsible_id);

                if (result == 1) {
                    JOptionPane.showMessageDialog(rootPane, "Income updated successfully.");

                    update_incomeIdLabel.setText(null);
                    update_incomeAmountTextField.setText(null);

                    loadComboInAddIncomeTab();
                    loadComboInSearchIncomeTab();
                    loadComboInUpdateIncomeTab();
                    loadComboInDeleteIncomeTab();

                    update_searchButton.doClick();
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Income updating failed. Please retry saving with corrrect details.");
                }

                update_searchButton.doClick();
            } else {
                JOptionPane.showMessageDialog(rootPane, "None of the fields cannot be null. Please recheck before you update income.");
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ManageExpenditure.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_update_incomeButtonActionPerformed

    private void update_printIncomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_printIncomeButtonActionPerformed
        update_incomeButton.doClick();
    }//GEN-LAST:event_update_printIncomeButtonActionPerformed

    private void delete_dateCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_dateCheckBoxActionPerformed
        delete_idCheckBox.setSelected(false);
        delete_rangeOfDatesCheckBox.setSelected(false);

        delete_date1Label.setEnabled(true);
        delete_date1CalendarCombo.setEnabled(true);

        delete_date2Label.setEnabled(false);
        delete_date2CalendarCombo.setEnabled(false);

        delete_idLabel.setEnabled(false);
        delete_idComboBox.setEnabled(false);

        if (!delete_dateCheckBox.isSelected()) {
            delete_date1Label.setEnabled(false);
            delete_date1CalendarCombo.setEnabled(false);
        }
    }//GEN-LAST:event_delete_dateCheckBoxActionPerformed

    private void delete_rangeOfDatesCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_rangeOfDatesCheckBoxActionPerformed
        delete_idCheckBox.setSelected(false);
        delete_dateCheckBox.setSelected(false);

        delete_date1Label.setEnabled(true);
        delete_date1CalendarCombo.setEnabled(true);

        delete_date2Label.setEnabled(true);
        delete_date2CalendarCombo.setEnabled(true);

        delete_idLabel.setEnabled(false);
        delete_idComboBox.setEnabled(false);

        if (!delete_rangeOfDatesCheckBox.isSelected()) {
            delete_date1Label.setEnabled(false);
            delete_date1CalendarCombo.setEnabled(false);

            delete_date2Label.setEnabled(false);
            delete_date2CalendarCombo.setEnabled(false);
        }
    }//GEN-LAST:event_delete_rangeOfDatesCheckBoxActionPerformed

    private void delete_reasonCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_reasonCheckBoxActionPerformed
        delete_idCheckBox.setSelected(false);
        delete_reasonLabel.setEnabled(true);
        delete_reasonComboBox.setEnabled(true);

        delete_idLabel.setEnabled(false);
        delete_idComboBox.setEnabled(false);

        if (!delete_reasonCheckBox.isSelected()) {
            delete_reasonLabel.setEnabled(false);
            delete_reasonComboBox.setEnabled(false);
        }
    }//GEN-LAST:event_delete_reasonCheckBoxActionPerformed

    private void delete_donatorCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_donatorCheckBoxActionPerformed
        delete_idCheckBox.setSelected(false);

        delete_donatorLabel.setEnabled(true);
        delete_donatorComboBox.setEnabled(true);

        delete_idLabel.setEnabled(false);
        delete_idComboBox.setEnabled(false);

        if (!delete_takerCheckBox.isSelected()) {
            delete_donatorLabel.setEnabled(false);
            delete_donatorComboBox.setEnabled(false);
        }
    }//GEN-LAST:event_delete_donatorCheckBoxActionPerformed

    private void delete_takerCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_takerCheckBoxActionPerformed
        delete_idCheckBox.setSelected(false);
        delete_takerLabel.setEnabled(true);
        delete_takerComboBox.setEnabled(true);

        delete_idLabel.setEnabled(false);
        delete_idComboBox.setEnabled(false);

        if (!delete_takerCheckBox.isSelected()) {
            delete_takerLabel.setEnabled(false);
            delete_takerComboBox.setEnabled(false);
        }
    }//GEN-LAST:event_delete_takerCheckBoxActionPerformed

    private void delete_amountCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_amountCheckBoxActionPerformed
        delete_idCheckBox.setSelected(false);
        delete_moreThanAmountCheckBox.setSelected(false);
        delete_lessThanAmountCheckBox.setSelected(false);
        delete_takerLabel.setEnabled(true);
        delete_takerComboBox.setEnabled(true);

        delete_idLabel.setEnabled(false);
        delete_idComboBox.setEnabled(false);

        if (!delete_takerCheckBox.isSelected()) {
            delete_takerLabel.setEnabled(false);
            delete_takerComboBox.setEnabled(false);
        }
    }//GEN-LAST:event_delete_amountCheckBoxActionPerformed

    private void delete_moreThanAmountCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_moreThanAmountCheckBoxActionPerformed
        delete_idCheckBox.setSelected(false);
        delete_amountCheckBox.setSelected(false);
        delete_lessThanAmountCheckBox.setSelected(false);

        delete_amountLabel.setEnabled(true);
        delete_amountTextField.setEnabled(true);

        delete_idLabel.setEnabled(false);
        delete_idComboBox.setEnabled(false);

        if (!delete_moreThanAmountCheckBox.isSelected()) {
            delete_amountLabel.setEnabled(false);
            delete_amountTextField.setEnabled(false);
        }
    }//GEN-LAST:event_delete_moreThanAmountCheckBoxActionPerformed

    private void delete_lessThanAmountCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_lessThanAmountCheckBoxActionPerformed
        delete_idCheckBox.setSelected(false);
        delete_amountCheckBox.setSelected(false);
        delete_moreThanAmountCheckBox.setSelected(false);

        delete_amountLabel.setEnabled(true);
        delete_amountTextField.setEnabled(true);

        delete_idLabel.setEnabled(false);
        delete_idComboBox.setEnabled(false);

        if (!delete_lessThanAmountCheckBox.isSelected()) {
            delete_amountLabel.setEnabled(false);
            delete_amountTextField.setEnabled(false);
        }
    }//GEN-LAST:event_delete_lessThanAmountCheckBoxActionPerformed

    private void delete_idCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_idCheckBoxActionPerformed
        delete_dateCheckBox.setSelected(false);
        delete_rangeOfDatesCheckBox.setSelected(false);
        delete_reasonCheckBox.setSelected(false);
        delete_donatorCheckBox.setSelected(false);
        delete_takerCheckBox.setSelected(false);
        delete_amountCheckBox.setSelected(false);
        delete_moreThanAmountCheckBox.setSelected(false);
        delete_lessThanAmountCheckBox.setSelected(false);

        delete_date1CalendarCombo.setEnabled(false);
        delete_date2CalendarCombo.setEnabled(false);
        delete_reasonComboBox.setEnabled(false);
        delete_donatorComboBox.setEnabled(false);
        delete_takerComboBox.setEnabled(false);
        delete_amountTextField.setEnabled(false);
        delete_date1Label.setEnabled(false);
        delete_date2Label.setEnabled(false);
        delete_reasonLabel.setEnabled(false);
        delete_donatorLabel.setEnabled(false);
        delete_takerLabel.setEnabled(false);
        delete_amountLabel.setEnabled(false);

        delete_idLabel.setEnabled(true);
        delete_idComboBox.setEnabled(true);

        if (!delete_idCheckBox.isSelected()) {
            delete_idLabel.setEnabled(false);
            delete_idComboBox.setEnabled(false);
        }
    }//GEN-LAST:event_delete_idCheckBoxActionPerformed

    private void delete_searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_searchButtonActionPerformed
        try {
            if (delete_dateCheckBox.isSelected() || delete_rangeOfDatesCheckBox.isSelected()
                    || delete_reasonCheckBox.isSelected() || delete_donatorCheckBox.isSelected()
                    || delete_takerCheckBox.isSelected() || delete_amountCheckBox.isSelected()
                    || delete_moreThanAmountCheckBox.isSelected() || delete_lessThanAmountCheckBox.isSelected()
                    || delete_idCheckBox.isSelected()) {
                String query = "SELECT * FROM income ";
                if (delete_idCheckBox.isSelected()) {
                    String income_id = delete_idComboBox.getSelectedItem() + "";
                    query += "WHERE income_id = '" + income_id + "' ";

                } else {
                    query += "WHERE ";
                    boolean useAnd = false;

                    if (delete_dateCheckBox.isSelected()) {
                        String expenditure_date = simpleDateFormat.format(delete_date1CalendarCombo.getDate());
                        query += "income_date ='" + expenditure_date + "' ";
                        useAnd = true;

                    } else if (delete_rangeOfDatesCheckBox.isSelected()) {
                        String date1 = simpleDateFormat.format(delete_date1CalendarCombo.getDate());
                        String date2 = simpleDateFormat.format(delete_date2CalendarCombo.getDate());

                        query += "income_date BETWEEN '" + date1 + "' AND '" + date2 + "' ";
                        useAnd = true;
                    }

                    if (delete_donatorCheckBox.isSelected()) {
                        String donator_name = (String) delete_donatorComboBox.getSelectedItem();
                        object = donatorController.searchDonator("donator_name", donator_name);
                        String donator_id = (String) object[0];
                        if (useAnd) {
                            query += "AND donator_id = '" + donator_id + "' ";
                        } else {
                            query += "donator_id = '" + donator_id + "' ";
                        }
                        useAnd = true;
                    }

                    if (delete_reasonCheckBox.isSelected()) {
                        String income_reason = delete_reasonComboBox.getSelectedItem() + "";
                        object = incomeReasonController.searchIncomeReason("incomeReason_title", income_reason);
                        String incomeReason_id = (String) object[0];

                        if (useAnd) {
                            query += "AND incomeReason_id ='" + incomeReason_id + "' ";
                        } else {
                            query += "incomeReason_id ='" + incomeReason_id + "' ";
                        }
                        useAnd = true;
                    }

                    if (delete_takerCheckBox.isSelected()) {
                        String responsible_name = delete_takerComboBox.getSelectedItem() + "";
                        object = responsibleController.searchResponsible("responsible_name", responsible_name);
                        String responsible_id = (String) object[0];

                        if (useAnd) {
                            query += "AND responsible_id ='" + responsible_id + "' ";
                        } else {
                            query += "responsible_id ='" + responsible_id + "' ";
                        }
                        useAnd = true;
                    }

                    if (delete_amountCheckBox.isSelected()) {
                        double income_amount = Double.parseDouble(delete_amountTextField.getText());

                        if (useAnd) {
                            query += "AND income_amount ='" + income_amount + "' ";
                        } else {
                            query += "income_amount ='" + income_amount + "' ";
                        }
                    } else if (delete_moreThanAmountCheckBox.isSelected()) {
                        double income_amount = Double.parseDouble(delete_amountTextField.getText());

                        if (useAnd) {
                            query += "AND income_amount >'" + income_amount + "' ";
                        } else {
                            query += "income_amount >'" + income_amount + "' ";
                        }
                    } else if (delete_lessThanAmountCheckBox.isSelected()) {
                        double income_amount = Double.parseDouble(delete_amountTextField.getText());

                        if (useAnd) {
                            query += "AND income_amount <'" + income_amount + "' ";
                        } else {
                            query += "income_amount <'" + income_amount + "' ";
                        }
                    }
                }

                ArrayList<Object[]> arrayList = incomeController.searchAllIncome(query);
                dtmForDelete.setRowCount(0);

                for (int i = 0; i < arrayList.size(); i++) {
                    Object[] objectToFillTable = new Object[6];

                    objectToFillTable[0] = arrayList.get(i)[0];

                    object = donatorController.searchDonator("donator_id", (String) arrayList.get(i)[1]);
                    objectToFillTable[1] = object[1];

                    object = incomeReasonController.searchIncomeReason("incomeReason_id", (String) arrayList.get(i)[2]);
                    objectToFillTable[2] = object[1];

                    objectToFillTable[3] = arrayList.get(i)[5];
                    objectToFillTable[4] = arrayList.get(i)[4];

                    object = responsibleController.searchResponsible("responsible_id", (String) arrayList.get(i)[3]);
                    objectToFillTable[5] = object[1];

                    dtmForDelete.addRow(objectToFillTable);
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Please select at least one filter to search income data");
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ManageExpenditure.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_delete_searchButtonActionPerformed

    private void delete_incomeTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete_incomeTableMouseClicked
        int selectedRow = delete_incomeTable.getSelectedRow();
        delete_incomeIdLabel.setText((String) dtmForDelete.getValueAt(selectedRow, 0));
        delete_donatorNameLabel.setText((String) dtmForDelete.getValueAt(selectedRow, 1));
        delete_incomeReasonLabel.setText((String) dtmForDelete.getValueAt(selectedRow, 2));
        delete_incomeAmountLabel.setText((String) dtmForDelete.getValueAt(selectedRow, 3));
        delete_incomeDateLabel.setText((String) dtmForDelete.getValueAt(selectedRow, 4));
        delete_responsibleLabel.setText((String) dtmForDelete.getValueAt(selectedRow, 5));
    }//GEN-LAST:event_delete_incomeTableMouseClicked

    private void delete_incomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_incomeButtonActionPerformed
        try {
            String income_id = delete_incomeIdLabel.getText();
            int result = incomeController.deleteIncome(income_id);

            if (result == 1) {
                JOptionPane.showMessageDialog(rootPane, "Income deleted successfully.");

                delete_incomeIdLabel.setText(null);
                delete_donatorNameLabel.setText(null);
                delete_incomeReasonLabel.setText(null);
                delete_incomeAmountLabel.setText(null);
                delete_incomeDateLabel.setText(null);
                delete_responsibleLabel.setText(null);

                loadComboInAddIncomeTab();
                loadComboInSearchIncomeTab();
                loadComboInUpdateIncomeTab();
                loadComboInDeleteIncomeTab();

                add_incomeIdLabel.setText(idGenerator.generateId("ee"));
                delete_searchButton.doClick();
            } else {
                JOptionPane.showMessageDialog(rootPane, "Unable to delete the selected income.");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ManageExpenditure.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_delete_incomeButtonActionPerformed

    public void loadComboInAddIncomeTab() throws ClassNotFoundException, SQLException {
        add_donatorComboBox.removeAllItems();
        comboBoxFunctions.loadCombo(add_donatorComboBox, "donator", "donator_name");
        comboSearch1.setSearchableCombo(add_donatorComboBox, true, "No such donator available");

        add_donationReasonComboBox.removeAllItems();
        comboBoxFunctions.loadCombo(add_donationReasonComboBox, "incomeReason", "incomeReason_title");
        comboSearch2.setSearchableCombo(add_donationReasonComboBox, true, "No such income reason available");

        add_responsibleComboBox.removeAllItems();
        comboBoxFunctions.loadCombo(add_responsibleComboBox, "responsible", "responsible_name");
        comboSearch3.setSearchableCombo(add_responsibleComboBox, true, "No such responsible reason available");
    }

    public void loadComboInSearchIncomeTab() throws ClassNotFoundException, SQLException {
        search_reasonComboBox.removeAllItems();
        comboBoxFunctions.loadCombo(search_reasonComboBox, "incomeReason", "incomeReason_title");
        comboSearch2.setSearchableCombo(search_reasonComboBox, true, "No such income reason available");

        search_donatorComboBox.removeAllItems();
        comboBoxFunctions.loadCombo(search_donatorComboBox, "donator", "donator_name");
        comboSearch1.setSearchableCombo(search_donatorComboBox, true, "No such donator available");

        search_takerComboBox.removeAllItems();
        comboBoxFunctions.loadCombo(search_takerComboBox, "responsible", "responsible_name");
        comboSearch3.setSearchableCombo(search_takerComboBox, true, "No such responsible available");

        search_idComboBox.removeAllItems();
        comboBoxFunctions.loadCombo(search_idComboBox, "income", "income_id");
        comboSearch4.setSearchableCombo(search_idComboBox, true, "No such income available");
    }

    public void loadComboInUpdateIncomeTab() throws ClassNotFoundException, SQLException {
        update_reasonComboBox.removeAllItems();
        comboBoxFunctions.loadCombo(update_reasonComboBox, "incomeReason", "incomeReason_title");
        comboSearch2.setSearchableCombo(update_reasonComboBox, true, "No such income reason available");

        update_donatorComboBox.removeAllItems();
        comboBoxFunctions.loadCombo(update_donatorComboBox, "donator", "donator_name");
        comboSearch1.setSearchableCombo(update_donatorComboBox, true, "No such donator available");

        update_takerComboBox.removeAllItems();
        comboBoxFunctions.loadCombo(update_takerComboBox, "responsible", "responsible_name");
        comboSearch3.setSearchableCombo(update_takerComboBox, true, "No such responsible available");

        update_idComboBox.removeAllItems();
        comboBoxFunctions.loadCombo(update_idComboBox, "income", "income_id");
        comboSearch4.setSearchableCombo(update_idComboBox, true, "No such income available");

        update_donatorNameComboBox.removeAllItems();
        comboBoxFunctions.loadCombo(update_donatorNameComboBox, "donator", "donator_name");
        comboSearch1.setSearchableCombo(update_donatorNameComboBox, true, "No such donator available");

        update_incomeReasonComboBox.removeAllItems();
        comboBoxFunctions.loadCombo(update_incomeReasonComboBox, "incomeReason", "incomeReason_title");
        comboSearch2.setSearchableCombo(update_incomeReasonComboBox, true, "No such income reason available");

        update_responsibleComboBox.removeAllItems();
        comboBoxFunctions.loadCombo(update_responsibleComboBox, "responsible", "responsible_name");
        comboSearch3.setSearchableCombo(update_responsibleComboBox, true, "No such responsible available");
    }

    public void loadComboInDeleteIncomeTab() throws ClassNotFoundException, SQLException {
        delete_reasonComboBox.removeAllItems();
        comboBoxFunctions.loadCombo(delete_reasonComboBox, "incomeReason", "incomeReason_title");
        comboSearch2.setSearchableCombo(delete_reasonComboBox, true, "No such income reason available");

        delete_donatorComboBox.removeAllItems();
        comboBoxFunctions.loadCombo(delete_donatorComboBox, "donator", "donator_name");
        comboSearch1.setSearchableCombo(delete_donatorComboBox, true, "No such donator available");

        delete_takerComboBox.removeAllItems();
        comboBoxFunctions.loadCombo(delete_takerComboBox, "responsible", "responsible_name");
        comboSearch3.setSearchableCombo(delete_takerComboBox, true, "No such responsible available");

        delete_idComboBox.removeAllItems();
        comboBoxFunctions.loadCombo(delete_idComboBox, "income", "income_id");
        comboSearch4.setSearchableCombo(delete_idComboBox, true, "No such income available");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ManageIncome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageIncome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageIncome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageIncome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageIncome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField add_amountTextField;
    private org.freixas.jcalendar.JCalendar add_dateCalendar;
    private javax.swing.JComboBox add_donationReasonComboBox;
    private javax.swing.JButton add_donatorButton;
    private javax.swing.JComboBox add_donatorComboBox;
    private javax.swing.JLabel add_incomeIdLabel;
    private javax.swing.JButton add_reasonButton;
    private javax.swing.JButton add_responsibleButton;
    private javax.swing.JComboBox add_responsibleComboBox;
    private javax.swing.JButton add_saveAndPrintButton;
    private javax.swing.JButton add_saveButton;
    private javax.swing.JCheckBox delete_amountCheckBox;
    private javax.swing.JLabel delete_amountLabel;
    private javax.swing.JTextField delete_amountTextField;
    private org.freixas.jcalendar.JCalendarCombo delete_date1CalendarCombo;
    private javax.swing.JLabel delete_date1Label;
    private org.freixas.jcalendar.JCalendarCombo delete_date2CalendarCombo;
    private javax.swing.JLabel delete_date2Label;
    private javax.swing.JCheckBox delete_dateCheckBox;
    private javax.swing.JCheckBox delete_donatorCheckBox;
    private javax.swing.JComboBox delete_donatorComboBox;
    private javax.swing.JLabel delete_donatorLabel;
    private javax.swing.JLabel delete_donatorNameLabel;
    private javax.swing.JCheckBox delete_idCheckBox;
    private javax.swing.JComboBox delete_idComboBox;
    private javax.swing.JLabel delete_idLabel;
    private javax.swing.JLabel delete_incomeAmountLabel;
    private javax.swing.JButton delete_incomeButton;
    private javax.swing.JLabel delete_incomeDateLabel;
    private javax.swing.JLabel delete_incomeIdLabel;
    private javax.swing.JLabel delete_incomeReasonLabel;
    private javax.swing.JTable delete_incomeTable;
    private javax.swing.JCheckBox delete_lessThanAmountCheckBox;
    private javax.swing.JCheckBox delete_moreThanAmountCheckBox;
    private javax.swing.JCheckBox delete_rangeOfDatesCheckBox;
    private javax.swing.JCheckBox delete_reasonCheckBox;
    private javax.swing.JComboBox delete_reasonComboBox;
    private javax.swing.JLabel delete_reasonLabel;
    private javax.swing.JLabel delete_responsibleLabel;
    private javax.swing.JButton delete_searchButton;
    private javax.swing.JCheckBox delete_takerCheckBox;
    private javax.swing.JComboBox delete_takerComboBox;
    private javax.swing.JLabel delete_takerLabel;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    public javax.swing.JTabbedPane manageIncomeTabbedPane;
    private javax.swing.JCheckBox search_amountCheckBox;
    private javax.swing.JLabel search_amountLabel;
    private javax.swing.JTextField search_amountTextField;
    private org.freixas.jcalendar.JCalendarCombo search_date1CalendarCombo;
    private javax.swing.JLabel search_date1Label;
    private org.freixas.jcalendar.JCalendarCombo search_date2CalendarCombo;
    private javax.swing.JLabel search_date2Label;
    private javax.swing.JCheckBox search_dateCheckBox;
    private javax.swing.JCheckBox search_donatorCheckBox;
    private javax.swing.JComboBox search_donatorComboBox;
    private javax.swing.JLabel search_donatorLabel;
    private javax.swing.JCheckBox search_idCheckBox;
    private javax.swing.JComboBox search_idComboBox;
    private javax.swing.JLabel search_idLabel;
    private javax.swing.JTable search_incomeTable;
    private javax.swing.JCheckBox search_lessThanAmountCheckBox;
    private javax.swing.JCheckBox search_moreThanAmountCheckBox;
    private javax.swing.JCheckBox search_rangeOfDatesCheckBox;
    private javax.swing.JCheckBox search_reasonCheckBox;
    private javax.swing.JComboBox search_reasonComboBox;
    private javax.swing.JLabel search_reasonLabel;
    private javax.swing.JButton search_searchButton;
    private javax.swing.JCheckBox search_takerCheckBox;
    private javax.swing.JComboBox search_takerComboBox;
    private javax.swing.JLabel search_takerLabel;
    private javax.swing.JButton update_addDonatorButton;
    private javax.swing.JButton update_addReasonButton;
    private javax.swing.JButton update_addResponsibleButton;
    private javax.swing.JCheckBox update_amountCheckBox;
    private javax.swing.JLabel update_amountLabel;
    private javax.swing.JTextField update_amountTextField;
    private org.freixas.jcalendar.JCalendarCombo update_date1CalendarCombo;
    private javax.swing.JLabel update_date1Label;
    private org.freixas.jcalendar.JCalendarCombo update_date2CalendarCombo;
    private javax.swing.JLabel update_date2Label;
    private javax.swing.JCheckBox update_dateCheckBox;
    private javax.swing.JCheckBox update_donatorCheckBox;
    private javax.swing.JComboBox update_donatorComboBox;
    private javax.swing.JLabel update_donatorLabel;
    private javax.swing.JComboBox update_donatorNameComboBox;
    private javax.swing.JCheckBox update_idCheckBox;
    private javax.swing.JComboBox update_idComboBox;
    private javax.swing.JLabel update_idLabel;
    private javax.swing.JTextField update_incomeAmountTextField;
    private javax.swing.JButton update_incomeButton;
    private org.freixas.jcalendar.JCalendar update_incomeDateCalendarCombo;
    private javax.swing.JLabel update_incomeIdLabel;
    private javax.swing.JComboBox update_incomeReasonComboBox;
    private javax.swing.JTable update_incomeTable;
    private javax.swing.JCheckBox update_lessThanAmountCheckBox;
    private javax.swing.JCheckBox update_moreThanAmountCheckBox;
    private javax.swing.JButton update_printIncomeButton;
    private javax.swing.JCheckBox update_rangeOfDatesCheckBox;
    private javax.swing.JCheckBox update_reasonCheckBox;
    private javax.swing.JComboBox update_reasonComboBox;
    private javax.swing.JLabel update_reasonLabel;
    private javax.swing.JComboBox update_responsibleComboBox;
    private javax.swing.JButton update_searchButton;
    private javax.swing.JCheckBox update_takerCheckBox;
    private javax.swing.JComboBox update_takerComboBox;
    private javax.swing.JLabel update_takerLabel;
    // End of variables declaration//GEN-END:variables
}
