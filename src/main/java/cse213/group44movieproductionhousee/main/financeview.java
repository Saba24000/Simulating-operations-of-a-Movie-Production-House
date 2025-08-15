package com.example.main;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class financeview {

    @FXML private ListView<String> financeNav;

    // Budget
    @FXML private TextField budgetProject, budgetAmount, annualLimit;
    @FXML private TableView<?> budgetTable;

    // Expense
    @FXML private TableView<?> expenseTable;
    @FXML private RadioButton rbApprove, rbReject;
    @FXML private TextField rejectReason;

    // Payroll
    @FXML private ComboBox<String> payrollMonth;
    @FXML private TextField bonusDeduction;
    @FXML private TableView<?> payrollTable;

    // Invoice
    @FXML private TableView<?> invoiceTable;

    // Forecast
    @FXML private TextField marketingSpend, releaseDate;
    @FXML private TableView<?> forecastTable;

    // Tax
    @FXML private ComboBox<String> taxRegion;
    @FXML private TableView<?> taxTable;

    // Cashflow
    @FXML private TableView<?> pendingInvoicesTable;
    @FXML private TextField cashflowComment;

    // Audit
    @FXML private ComboBox<String> auditProjectSelect;
    @FXML private TableView<?> auditTable;

    // TitledPanes
    @FXML private TitledPane paneBudget, paneExpense, panePayroll, paneInvoice,
            paneForecast, paneTax, paneCashflow, paneAudit;

    @FXML
    private void initialize() {
        if (payrollMonth != null) {
            payrollMonth.getItems().addAll("Jan", "Feb", "Mar", "Apr", "May", "Jun",
                    "Jul", "Aug", "Sep", "Oct", "Nov", "Dec");
        }
        if (taxRegion != null) {
            taxRegion.getItems().addAll("US-CA", "UK", "EU", "BD", "IN");
        }
        if (auditProjectSelect != null) {
            auditProjectSelect.getItems().addAll("Project Alpha", "Project Beta");
        }
        showOnly(paneBudget);
        financeNav.getSelectionModel().select(0);
    }

    @FXML
    private void handleOpenModule() {
        String sel = financeNav.getSelectionModel().getSelectedItem();
        if (sel == null) return;
        switch (sel) {
            case "Budget Planner": showOnly(paneBudget); break;
            case "Expense Tracker": showOnly(paneExpense); break;
            case "Payroll System": showOnly(panePayroll); break;
            case "Invoice Hub": showOnly(paneInvoice); break;
            case "Revenue Forecasting": showOnly(paneForecast); break;
            case "Tax & Incentives": showOnly(paneTax); break;
            case "Cash Flow Dashboard": showOnly(paneCashflow); break;
            case "Audit Module": showOnly(paneAudit); break;
        }
    }

    private void showOnly(TitledPane pane) {
        paneBudget.setVisible(false); paneExpense.setVisible(false); panePayroll.setVisible(false);
        paneInvoice.setVisible(false); paneForecast.setVisible(false); paneTax.setVisible(false);
        paneCashflow.setVisible(false); paneAudit.setVisible(false);
        paneBudget.setManaged(false); paneExpense.setManaged(false); panePayroll.setManaged(false);
        paneInvoice.setManaged(false); paneForecast.setManaged(false); paneTax.setManaged(false);
        paneCashflow.setManaged(false); paneAudit.setManaged(false);

        pane.setVisible(true);
        pane.setManaged(true);
    }

    // Handlers (hook your data + file I/O here)
    @FXML private void handleAssignFunds(){ System.out.println("[Fin] Assign funds"); }
    @FXML private void handleValidateBudget(){ System.out.println("[Fin] Validate ≤ annual limit"); }
    @FXML private void handleGenerateBudgetPdf(){ System.out.println("[Fin] Generate PDF"); }
    @FXML private void handleSubmitBudget(){ System.out.println("[Fin] Submit to CEO"); }
    @FXML private void handleArchiveBudget(){ System.out.println("[Fin] Archive approved"); }

    @FXML private void handleViewReceipts(){ System.out.println("[Fin] View receipts"); }
    @FXML private void handleSubmitExpenseDecision(){
        boolean approve = rbApprove.isSelected();
        System.out.println("[Fin] Expense " + (approve ? "Approved" : "Rejected") +
                (approve ? "" : " | Reason: " + rejectReason.getText()));
    }

    @FXML private void handleVerifyAttendance(){ System.out.println("[Fin] Verify attendance"); }
    @FXML private void handleApplyBonusDeduction(){ System.out.println("[Fin] Apply bonus/deduction"); }
    @FXML private void handleCalcNetPay(){ System.out.println("[Fin] Calc net pay"); }
    @FXML private void handleExportBankFile(){ System.out.println("[Fin] Export bank transfer file"); }
    @FXML private void handleSendPayslips(){ System.out.println("[Fin] Send payslips"); }

    @FXML private void handleMatchPOs(){ System.out.println("[Fin] Match invoices with POs"); }
    @FXML private void handleFlagDiscrepancy(){ System.out.println("[Fin] Flag discrepancy"); }
    @FXML private void handleApprovePayment(){ System.out.println("[Fin] Approve payment"); }
    @FXML private void handleProcessBankApi(){ System.out.println("[Fin] Process payments via bank API"); }

    @FXML private void handleLoadHistorical(){ System.out.println("[Fin] Load historical data"); }
    @FXML private void handleRunProjections(){ System.out.println("[Fin] Run projections"); }
    @FXML private void handleValidateBenchmarks(){ System.out.println("[Fin] Validate against benchmarks"); }
    @FXML private void handleExportForecastReport(){ System.out.println("[Fin] Export forecast report"); }

    @FXML private void handleUploadExpenses(){ System.out.println("[Fin] Upload expenses"); }
    @FXML private void handleMatchCredits(){ System.out.println("[Fin] Match tax credits"); }
    @FXML private void handleSubmitGov(){ System.out.println("[Fin] Submit to government portal"); }
    @FXML private void handleTrackApproval(){ System.out.println("[Fin] Track approval status"); }
    @FXML private void handleAllocateIncentives(){ System.out.println("[Fin] Allocate incentives to budgets"); }

    @FXML private void handleApproveDispute(){ System.out.println("[Fin] Approve/Dispute payments"); }
    @FXML private void handleSchedulePayments(){ System.out.println("[Fin] Schedule payments"); }
    @FXML private void handleAlertProducers(){ System.out.println("[Fin] Alert producers – insufficient funds"); }

    @FXML private void handlePullTransactions(){ System.out.println("[Fin] Pull transactions"); }
    @FXML private void handleFlagAuditDisc(){ System.out.println("[Fin] Flag audit discrepancy"); }
    @FXML private void handleGenerateAuditReport(){ System.out.println("[Fin] Generate audit report"); }
    @FXML private void handleSubmitLegal(){ System.out.println("[Fin] Submit to legal"); }
    @FXML private void handleArchiveAuditTrail(){ System.out.println("[Fin] Archive audit trail"); }
}

