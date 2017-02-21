create table sapp.oplachennye_zakazy (
	data_oplaty DATE null,
	izvewenie_id LONG,
	oplachennye_zakazy_id LONG not null primary key,
	oplatil LONG,
	postavwik_id LONG,
	summa DOUBLE,
	tranzakcija VARCHAR(75) null
);