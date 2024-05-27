package org.example.echobot;

public class VkRequest {
    private String type;
    private VkObject object;
    private int group_id;

    // Getters and Setters
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public VkObject getObject() {
        return object;
    }

    public void setObject(VkObject object) {
        this.object = object;
    }

    public int getGroupId() {
        return group_id;
    }

    public void setGroupId(int group_id) {
        this.group_id = group_id;
    }
}
