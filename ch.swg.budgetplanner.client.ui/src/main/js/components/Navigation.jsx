import React from "react";
import Box from '@mui/material/Box';
import TopNavigation from "./navigation/TopNavigation";
import SideNavigation from "./navigation/SideNavigation";

export default class Navigation extends React.Component {

  render() {
    return (
      <Box>
        <TopNavigation />
        <SideNavigation />
      </Box>
    );
  }
}