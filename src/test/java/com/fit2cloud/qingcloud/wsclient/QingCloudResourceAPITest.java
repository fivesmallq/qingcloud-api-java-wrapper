package com.fit2cloud.qingcloud.wsclient;

import com.fit2cloud.qingcloud.wsclient.domain.model.QingCloudCollaboration;
import com.fit2cloud.qingcloud.wsclient.domain.model.QingCloudZone;
import com.fit2cloud.qingcloud.wsclient.ui.model.*;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class QingCloudResourceAPITest {

    private static final String ZONE = QingCloudZone.PEK3b;
    private static IQingCloudWSClient qingCloudWSClient;
    private static String accessKey;
    private static String secretKey;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        Properties properties = new Properties();
        properties.load(new FileInputStream(new File("/opt/.qingcloud/credential.txt")));
        accessKey = properties.getProperty("AccessKeyID");
        secretKey = properties.getProperty("SecretKey");
        qingCloudWSClient = new QingCloudWSClient(accessKey, secretKey);
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testAddResourceGroupItems() throws Exception {
        AddResourceGroupItemsRequest addResourceGroupItemsRequest = new AddResourceGroupItemsRequest();
        addResourceGroupItemsRequest.setZone(ZONE);
        List<String> resources = new ArrayList<String>();
        resources.add("i-mof3tqrb");
        addResourceGroupItemsRequest.setResources(resources);
        addResourceGroupItemsRequest.setResource_group("rg-9vge19o9");
        AddResourceGroupItemsResponse addResourceGroupItemsResponse = qingCloudWSClient.addResourceGroupItems(addResourceGroupItemsRequest);
        System.out.println(addResourceGroupItemsResponse.getResource_ids());
    }
    @Test
    public void testAddProjectResourcetems() throws Exception {
        AddProjectResourceItemsRequest addProjectResourceItemsRequest = new AddProjectResourceItemsRequest();
        addProjectResourceItemsRequest.setZone(ZONE);
        List<String> resources = new ArrayList<String>();
        resources.add("i-mof3tqrb");
        addProjectResourceItemsRequest.setResources(resources);
        addProjectResourceItemsRequest.setProject_id("pj-fust7gye");
        AddProjectResourceItemsResponse addProjectResourceItemsResponse = qingCloudWSClient.addProjectResourceItems(addProjectResourceItemsRequest);
        System.out.println(addProjectResourceItemsResponse.getResource_ids());
    }
    @Test
    public void testDeleteResourceGroupItems() throws Exception {
        DeleteResourceGroupItemsRequest deleteResourceGroupItemsRequest = new DeleteResourceGroupItemsRequest();
        deleteResourceGroupItemsRequest.setZone(ZONE);
        List<String> resources = new ArrayList<String>();
       // resources.add("i-p88fq0tg");
        resources.add("i-mof3tqrb");
        deleteResourceGroupItemsRequest.setResources(resources);
        deleteResourceGroupItemsRequest.setResource_group("rg-9vge19o9");
        DeleteResourceGroupItemsResponse deleteResourceGroupItemsResponse = qingCloudWSClient.deleteResourceGroupItems(deleteResourceGroupItemsRequest);
        System.out.println(deleteResourceGroupItemsResponse);
    }

    @Test
    public void testGrantResourceGroupsToUserGroups() throws Exception {
        GrantResourceGroupsToUserGroupsRequest request = new GrantResourceGroupsToUserGroupsRequest();
        List<QingCloudCollaboration> rur_set = new ArrayList<QingCloudCollaboration>();
        QingCloudCollaboration cloudCollaboration = new QingCloudCollaboration();
        cloudCollaboration.setResource_group("rg-9vge19o9");
        cloudCollaboration.setGroup_role("gr-a6kw9tj9");
        cloudCollaboration.setUser_group("ug-ldap76ww");
        rur_set.add(cloudCollaboration);
        request.setRur_set(rur_set);
        GrantResourceGroupsToUserGroupsResponse response = qingCloudWSClient.grantResourceGroupsToUserGroups(request);
        System.out.println(response.getRur_set());
    }
}
