package com.company.oop.teamProject.command;

import com.company.oop.teamProject.core.contracts.TaskManagementRepository;

import java.util.List;

public class ShowAllMembersCommand extends BaseCommand {
    public ShowAllMembersCommand(TaskManagementRepository taskManagementRepository) {
        super(taskManagementRepository);
    }

    @Override
    protected String executeCommand(List<String> parameters) {
        return getTaskManagementRepository().showAllMembers();
    }
}
