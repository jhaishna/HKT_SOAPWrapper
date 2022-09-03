package com.jaishna.soapwrapper.model.billing;

import com.jaishna.soapwrapper.model.Result;

import java.util.ArrayList;
import java.util.List;

public class ListBillDateModelResponse {

    private List<BillDateDTO> billDateDTOList = new ArrayList<BillDateDTO>();
    private Result result = new Result();

    public List<BillDateDTO> getBillDateDTOList() {
        return billDateDTOList;
    }

    public void setBillDateDTOList(List<BillDateDTO> billDateDTOList) {
        this.billDateDTOList = billDateDTOList;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }
}
