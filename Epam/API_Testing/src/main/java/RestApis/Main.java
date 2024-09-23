package RestApis;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Arrays; // Import Arrays for Arrays.asList

public class Main {
    public static void main(String[] args) throws Exception {
        // Create a new Pet object
        Pet pet = new Pet();
        pet.setId(12345);

        Category category = new Category();
        category.setId(1);
        category.setName("dog");
        pet.setCategory(category);

        pet.setName("snoopie");
        pet.setPhotoUrls(Arrays.asList("string")); // Use Arrays.asList instead of List.of

        Tag tag = new Tag();
        tag.setId(0);
        tag.setName("string");
        pet.setTags(Arrays.asList(tag)); // Use Arrays.asList instead of List.of

        pet.setStatus("pending");

        // Convert the Pet object to JSON
        ObjectMapper objectMapper = new ObjectMapper();
        String requestBody = objectMapper.writeValueAsString(pet);

        // Print the request body
        System.out.println(requestBody);
    }
}
