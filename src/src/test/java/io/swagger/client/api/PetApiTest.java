/*
 * Swagger Petstore
 * This is a sample Petstore server.  You can find out more about Swagger at [http://swagger.io](http://swagger.io) or on [irc.freenode.net, #swagger](http://swagger.io/irc/). 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import io.swagger.client.model.ModelApiResponse;
import io.swagger.client.model.Pet;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for PetApi
 */
@Ignore
public class PetApiTest {

    private final PetApi api = new PetApi();

    /**
     * Add a new pet to the store
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void addPetTest() throws Exception {
        Pet body = null;
        api.addPet(body);

        // TODO: test validations
    }
    /**
     * Deletes a pet
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deletePetTest() throws Exception {
        Long petId = null;
        String apiKey = null;
        api.deletePet(petId, apiKey);

        // TODO: test validations
    }
    /**
     * Finds Pets by status
     *
     * Multiple status values can be provided with comma separated strings
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void findPetsByStatusTest() throws Exception {
        List<String> status = null;
        List<Pet> response = api.findPetsByStatus(status);

        // TODO: test validations
    }
    /**
     * Finds Pets by tags
     *
     * Muliple tags can be provided with comma separated strings. Use\\ \\ tag1, tag2, tag3 for testing.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void findPetsByTagsTest() throws Exception {
        List<String> tags = null;
        List<Pet> response = api.findPetsByTags(tags);

        // TODO: test validations
    }
    /**
     * Find pet by ID
     *
     * Returns a single pet
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getPetByIdTest() throws Exception {
        Long petId = null;
        Pet response = api.getPetById(petId);

        // TODO: test validations
    }
    /**
     * Update an existing pet
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updatePetTest() throws Exception {
        Pet body = null;
        api.updatePet(body);

        // TODO: test validations
    }
    /**
     * Updates a pet in the store with form data
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updatePetWithFormTest() throws Exception {
        Long petId = null;
        String name = null;
        String status = null;
        api.updatePetWithForm(petId, name, status);

        // TODO: test validations
    }
    /**
     * uploads an image
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void uploadFileTest() throws Exception {
        Long petId = null;
        Object body = null;
        ModelApiResponse response = api.uploadFile(petId, body);

        // TODO: test validations
    }
}
