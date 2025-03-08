package domain.request;

import lombok.Data;

import java.util.List;

@Data
public class Request {
    private String name;
    private RequestType requestType;
    private List<String> requiredFields;
}
