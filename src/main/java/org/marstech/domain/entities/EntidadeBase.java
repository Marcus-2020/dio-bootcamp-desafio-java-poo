package org.marstech.domain.entities;

import java.util.UUID;

abstract class EntidadeBase {

    private UUID id;

    public EntidadeBase() {
    }

    public EntidadeBase(UUID id) {
        this.id = id;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}
