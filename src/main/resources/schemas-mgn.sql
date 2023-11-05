IF NOT EXISTS (SELECT 1 FROM sys.databases WHERE name = 'reservation_mgm')
BEGIN
    CREATE DATABASE reservation_mgm;
END;
