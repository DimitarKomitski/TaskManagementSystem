package com.company.oop.teamProject.core;

import com.company.oop.teamProject.command.*;
import com.company.oop.teamProject.command.contracts.Command;
import com.company.oop.teamProject.command.contracts.enums.CommandType;
import com.company.oop.teamProject.core.contracts.CommandFactory;
import com.company.oop.teamProject.core.contracts.TaskManagementRepository;
import com.company.oop.teamProject.utils.ParsingHelpers;

public class CommandFactoryImpl implements CommandFactory {
    @Override
    public Command createCommandFromCommandName(String commandTypeAsString, TaskManagementRepository taskManagementRepository) {
        CommandType commandType = ParsingHelpers.tryParseEnum(commandTypeAsString, CommandType.class);

        switch (commandType) {
            case CREATEMEMBER:
                return new CreateMemberCommand(taskManagementRepository);
            case CREATETEAM:
                return new CreateTeamCommand(taskManagementRepository);
            case CREATEBOARD:
                return new CreateBoardCommand(taskManagementRepository);
            case CREATEBUG:
                return new CreateBugCommand(taskManagementRepository);
            case CREATEFEEDBACK:
                return new CreateFeedbackCommand(taskManagementRepository);
            case CREATECOMMENT:
                return new CreateCommentCommand(taskManagementRepository);
            case ADDMEMBERTOTEAM:
                return new AddMemberToTeamCommand(taskManagementRepository);
            case SHOWALLMEMBERS:
                return new ShowAllMembersCommand(taskManagementRepository);
            case SHOWALLTEAMS:
                return new ShowAllTeamsCommand(taskManagementRepository);
            case SHOWALLBOARDS:
                return new ShowAllBoardsCommand(taskManagementRepository);
            case SHOWALLTEAMMEMBERS:
                return new ShowAllTeamMembersCommand(taskManagementRepository);
            case ASSIGNBUG:
                return new AssignBugCommand(taskManagementRepository);
            default:
                throw new IllegalArgumentException();
        }
    }
}
