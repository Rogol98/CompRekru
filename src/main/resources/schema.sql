create table device_location(
    deviceLocationID bigint not null auto_increment primary key,
    timeOfMeasurement datetime not null,
    deviceID int not null,
    longitude int not null,
    latitude int not null
);