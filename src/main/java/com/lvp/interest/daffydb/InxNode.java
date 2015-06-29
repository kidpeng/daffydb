package com.lvp.interest.daffydb;

import java.util.List;

public class InxNode {
    //index file
    //data file
    // 1.inx
    // 1.data
    // 1.inx.cp
    // 1.data.cp
    // 2.inx
    // 2.data
    private List<Key>  keys;
    private List<Long> subNodePointers;
}

// nodeLen