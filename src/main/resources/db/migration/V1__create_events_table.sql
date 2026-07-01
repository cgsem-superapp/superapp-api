CREATE TABLE events (
                        id BIGSERIAL PRIMARY KEY,
                        name VARCHAR(255) NOT NULL,
                        type VARCHAR(50) NOT NULL,
                        status VARCHAR(50) NOT NULL DEFAULT 'DRAFT',
                        description TEXT,
                        start_time TIMESTAMP NOT NULL,
                        end_time TIMESTAMP NOT NULL,
                        created_by VARCHAR(255) NOT NULL,
                        created_at TIMESTAMP NOT NULL DEFAULT NOW(),
                        updated_at TIMESTAMP NOT NULL DEFAULT NOW()
);
COMMENT ON TABLE events IS 'Su kien / chien dich cua CLB';
COMMENT ON COLUMN events.type IS 'OFFLINE | ONLINE | CAMPAIGN';
COMMENT ON COLUMN events.status IS 'DRAFT | ACTIVE | MONITORING | CLOSING | REPORTED';