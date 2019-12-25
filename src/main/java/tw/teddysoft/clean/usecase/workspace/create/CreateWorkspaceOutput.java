package tw.teddysoft.clean.usecase.workspace.create;

import tw.teddysoft.clean.domain.usecase.Output;

public interface CreateWorkspaceOutput extends Output {
    void setWorkspaceId(String id);
    String getWorkspaceId();
}