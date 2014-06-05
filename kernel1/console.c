void clear(void)
{
	char* video = (char*) 0xb8000;
	int i;
	for (i=0;i<4000;i++)
	{
		video[i]=0;
	}
}
