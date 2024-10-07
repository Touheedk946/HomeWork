package JiraAutomation;

public class Main {

    public static void main(String[] args) {
        // 1. Create Defect
        String defectId = CreateDefect.createDefect();

        if (defectId != null) {
            // 2. Update Defect
            UpdateDefect.updateDefect(defectId);

            // 3. Search Defect
            SearchDefect.searchDefect(defectId);

            // 4. Add Attachment to Defect
            AddAttachment.addAttachment(defectId, "path/to/attachment.txt"); // Provide a valid path

            // 5. Delete Defect
            DeleteDefect.deleteDefect(defectId);
        }
    }
}
