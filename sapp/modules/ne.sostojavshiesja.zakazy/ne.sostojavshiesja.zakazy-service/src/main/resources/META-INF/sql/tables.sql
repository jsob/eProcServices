create table sapp.ne_sostojavshiesja_zakazy (
	data_sozdanija DATE null,
	izvewenie_id LONG,
	ne_sostojavshiesja_zakazy_id LONG not null primary key,
	prichina VARCHAR(75) null,
	sozdal LONG
);