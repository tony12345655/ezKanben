package tw.teddysoft.clean.usecase.lane.swimlane.create;

import tw.teddysoft.clean.domain.usecase.Output;

public interface CreateSwimLaneOutput extends Output {
    String getId();
    void setId(String laneId);
}
