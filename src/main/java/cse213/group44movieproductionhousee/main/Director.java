package com.example.main;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.StackPane;

public class Director {

    @FXML private ListView<String> directorNav;
    @FXML private StackPane directorContent;

    // Script Dashboard
    @FXML private ComboBox<String> scriptSelect;
    @FXML private TextArea sceneNotes;

    // Shot List
    @FXML private ComboBox<String> sceneSelect, angleSelect;
    @FXML private TextField refImagePath;
    @FXML private TableView<?> shotTable;

    // Rehearsal
    @FXML private TextField rehearsalDateTime, rehearsalLocation;
    @FXML private TextArea rehearsalNotes;

    // Costume
    @FXML private TableView<?> costumeTable;
    @FXML private TextField costumeComment;

    // VFX
    @FXML private TableView<?> vfxShotList;
    @FXML private ComboBox<String> vfxVendorSelect;

    // Post-Production
    @FXML private TextField timestampField, postNote;
    @FXML private ComboBox<String> revisionType;

    // Meeting
    @FXML private TextField meetingAgenda, meetingAttendees;

    // Festival
    @FXML private ComboBox<String> festivalSelect, festivalStatus;
    @FXML private TableView<?> festivalTable;

    // TitledPanes (used as "screens")
    @FXML private TitledPane paneScript, paneShotList, paneRehearsal, paneCostume,
            paneVfx, panePostProd, paneMeeting, paneFestival;

    @FXML
    private void initialize() {
        // Sample data
        if (scriptSelect != null) {
            scriptSelect.getItems().addAll("Script v1", "Script v2 (final)");
        }
        if (angleSelect != null) {
            angleSelect.getItems().addAll("Wide", "Medium", "Close-up", "Over-the-shoulder");
        }
        if (vfxVendorSelect != null) {
            vfxVendorSelect.getItems().addAll("Studio A", "Studio B");
        }
        if (festivalSelect != null) {
            festivalSelect.getItems().addAll("Cannes", "Venice", "Toronto", "Berlin");
        }
        if (festivalStatus != null) {
            festivalStatus.getItems().addAll("Pending", "Accepted", "Rejected");
        }
        // default screen
        showOnly(paneScript);
        directorNav.getSelectionModel().select(0);
    }

    @FXML
    private void handleOpenModule() {
        String sel = directorNav.getSelectionModel().getSelectedItem();
        if (sel == null) return;
        switch (sel) {
            case "Script Dashboard": showOnly(paneScript); break;
            case "Shot List Manager": showOnly(paneShotList); break;
            case "Rehearsal Scheduler": showOnly(paneRehearsal); break;
            case "Costume Tracker": showOnly(paneCostume); break;
            case "VFX Coordination": showOnly(paneVfx); break;
            case "Post-Production Review": showOnly(panePostProd); break;
            case "Meeting Scheduler": showOnly(paneMeeting); break;
            case "Festival Submission Tracker": showOnly(paneFestival); break;
        }
    }

    private void showOnly(TitledPane pane) {
        paneScript.setVisible(false); paneShotList.setVisible(false); paneRehearsal.setVisible(false);
        paneCostume.setVisible(false); paneVfx.setVisible(false); panePostProd.setVisible(false);
        paneMeeting.setVisible(false); paneFestival.setVisible(false);
        paneScript.setManaged(false); paneShotList.setManaged(false); paneRehearsal.setManaged(false);
        paneCostume.setManaged(false); paneVfx.setManaged(false); panePostProd.setManaged(false);
        paneMeeting.setManaged(false); paneFestival.setManaged(false);

        pane.setVisible(true);
        pane.setManaged(true);
    }

    // Sample handlers (add real logic/file I/O later)
    @FXML private void handleViewBreakdowns(){ System.out.println("[Director] View breakdowns"); }
    @FXML private void handleValidateScript(){ System.out.println("[Director] Validate with writer"); }
    @FXML private void handleApproveScript(){ System.out.println("[Director] Approve final script"); }
    @FXML private void handleNotifyProduction(){ System.out.println("[Director] Notify production team"); }

    @FXML private void handleAddShot(){ System.out.println("[Director] Add shot"); }
    @FXML private void handleUploadReference(){ System.out.println("[Director] Upload reference"); }
    @FXML private void handleVerifyContinuity(){ System.out.println("[Director] Verify continuity"); }
    @FXML private void handleSaveShotList(){ System.out.println("[Director] Save to shared drive"); }
    @FXML private void handleSyncCine(){ System.out.println("[Director] Sync with cinematographer"); }

    @FXML private void handleCheckAvailability(){ System.out.println("[Director] Check actor availability"); }
    @FXML private void handleSendInvites(){ System.out.println("[Director] Send calendar invites"); }
    @FXML private void handleShareRehearsalNotes(){ System.out.println("[Director] Share rehearsal notes"); }

    @FXML private void handleApproveCostume(){ System.out.println("[Director] Costume approved"); }
    @FXML private void handleRequestCostumeRev(){ System.out.println("[Director] Costume revisions requested"); }

    @FXML private void handleUploadVfxRefs(){ System.out.println("[Director] Upload VFX references"); }
    @FXML private void handleAssignVfxVendor(){ System.out.println("[Director] Assign VFX vendor"); }
    @FXML private void handleValidateVfxTimeline(){ System.out.println("[Director] Validate VFX timeline"); }
    @FXML private void handleApproveVfxDraft(){ System.out.println("[Director] Approve VFX draft"); }
    @FXML private void handleRejectVfxDraft(){ System.out.println("[Director] Reject VFX draft"); }

    @FXML private void handleLoadCut(){ System.out.println("[Director] Load cut"); }
    @FXML private void handleAddTimestampNote(){ System.out.println("[Director] Add timestamped note"); }
    @FXML private void handleRequestRevision(){ System.out.println("[Director] Request revision"); }
    @FXML private void handleApproveMaster(){ System.out.println("[Director] Approve final master"); }

    @FXML private void handleCheckMeetingAvailability(){ System.out.println("[Director] Check meeting availability"); }
    @FXML private void handleUploadMeetingMaterials(){ System.out.println("[Director] Upload meeting materials"); }
    @FXML private void handleRecordDecisions(){ System.out.println("[Director] Record decisions"); }
    @FXML private void handleDistributeMinutes(){ System.out.println("[Director] Distribute minutes"); }

    @FXML private void handleValidateFestivalSpecs(){ System.out.println("[Director] Validate festival specs"); }
    @FXML private void handleUploadPressKit(){ System.out.println("[Director] Upload press kit"); }
    @FXML private void handleSubmitFestival(){ System.out.println("[Director] Submit to festival"); }
}

