CREATE KEYSPACE IF NOT EXISTS processes
    WITH replication = {
        'class': 'SimpleStrategy',
        'replication_factor': 1
        };
